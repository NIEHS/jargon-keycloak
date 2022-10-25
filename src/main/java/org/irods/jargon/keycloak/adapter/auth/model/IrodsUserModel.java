/**
 * 
 */
package org.irods.jargon.keycloak.adapter.auth.model;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.irods.jargon.core.pub.domain.User;
import org.keycloak.models.ClientModel;
import org.keycloak.models.GroupModel;
import org.keycloak.models.RoleModel;
import org.keycloak.models.SubjectCredentialManager;
import org.keycloak.models.UserModel;

/**
 * Mapping of keycloak to iRODS user models
 * @author conwaymc
 *
 */
public class IrodsUserModel implements UserModel {
	private final User user;
	Set<RoleModel> roleModels = new HashSet<RoleModel>();
	Set<GroupModel> groupModels = new HashSet<GroupModel>();

	/**
	 * Keycloak representation of an iRODS user
	 * @param user
	 */
	public IrodsUserModel(final User user) {
		if (user == null) {
			throw new IllegalArgumentException("null user");
		}
		this.user = user;
		
		IrodsRoleModel irodsRoleModel = new IrodsRoleModel(user.getUserType().getTextValue());
		roleModels.add(irodsRoleModel);
		
	}

	@Override
	public Set<RoleModel> getRealmRoleMappings() {
		return roleModels;
	}

	@Override
	public Set<RoleModel> getClientRoleMappings(ClientModel app) {
		return roleModels;
	}

	@Override
	public boolean hasRole(RoleModel role) {
		return user.getUserType().getTextValue().equals(role.getName());
	}

	@Override
	public void grantRole(RoleModel role) {

	}

	@Override
	public Set<RoleModel> getRoleMappings() {
		return roleModels;
	}

	@Override
	public void deleteRoleMapping(RoleModel role) {
		
	}

	@Override
	public String getId() {
		return user.getId();
	}

	@Override
	public String getUsername() {
		return user.getName();
	}

	@Override
	public void setUsername(String username) {

	}

	@Override
	public Long getCreatedTimestamp() {
		return user.getCreateTime().getTime();
	}

	@Override
	public void setCreatedTimestamp(Long timestamp) {

	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public void setEnabled(boolean enabled) {

	}

	@Override
	public void setSingleAttribute(String name, String value) {

	}

	@Override
	public void setAttribute(String name, List<String> values) {

	}

	@Override
	public void removeAttribute(String name) {

	}

	@Override
	public String getFirstAttribute(String name) {
		return null;
	}

	@Override
	public List<String> getAttribute(String name) {
		return null;
	}

	@Override
	public Map<String, List<String>> getAttributes() {
		return null;
	}

	@Override
	public Set<String> getRequiredActions() {
		return null;
	}

	@Override
	public void addRequiredAction(String action) {

	}

	@Override
	public void removeRequiredAction(String action) {

	}

	@Override
	public String getFirstName() {
		return user.getName();
	}

	@Override
	public void setFirstName(String firstName) {

	}

	@Override
	public String getLastName() {
		return "";
	}

	@Override
	public void setLastName(String lastName) {

	}

	@Override
	public String getEmail() {
		return null;
	}

	@Override
	public void setEmail(String email) {

	}

	@Override
	public boolean isEmailVerified() {
		return false;
	}

	@Override
	public void setEmailVerified(boolean verified) {

	}

	@Override
	public Set<GroupModel> getGroups() {
		return groupModels;
	}

	@Override
	public void joinGroup(GroupModel group) {

	}

	@Override
	public void leaveGroup(GroupModel group) {

	}

	@Override
	public boolean isMemberOf(GroupModel group) {
		return groupModels.contains(group);
	}

	@Override
	public String getFederationLink() {
		return null;
	}

	@Override
	public void setFederationLink(String link) {

	}

	@Override
	public String getServiceAccountClientLink() {
		return null;
	}

	@Override
	public void setServiceAccountClientLink(String clientInternalId) {

	}

	@Override
	public SubjectCredentialManager credentialManager() {
		return null;
	}

}
