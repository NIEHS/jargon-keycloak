/**
 * 
 */
package org.irods.jargon.keycloak.adapter.auth.model;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.keycloak.models.RoleContainerModel;
import org.keycloak.models.RoleModel;

/**
 * iRODS Keycloak role model
 * @author conwaymc
 *
 */
public class IrodsRoleModel implements RoleModel {

	private final String userType;
	
	/**
	 * 
	 * @param userType
	 */
	public IrodsRoleModel(final String userType) {
		this.userType = userType;
	}

	@Override
	public String getName() {
		return userType;
	}

	@Override
	public String getDescription() {
		return userType;
	}

	@Override
	public void setDescription(String description) {

	}

	@Override
	public String getId() {
		return userType;
	}

	@Override
	public void setName(String name) {

	}

	@Override
	public boolean isComposite() {
		return false;
	}

	@Override
	public void addCompositeRole(RoleModel role) {

	}

	@Override
	public void removeCompositeRole(RoleModel role) {

	}

	@Override
	public Stream<RoleModel> getCompositesStream(String search, Integer first, Integer max) {
		
		return null;
	}

	@Override
	public boolean isClientRole() {
		return true;
	}

	@Override
	public String getContainerId() {
		return null;
	}

	@Override
	public RoleContainerModel getContainer() {
		return null;
	}

	@Override
	public boolean hasRole(RoleModel role) {
		return role.getName().equals(this.getName());
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
	public Stream<String> getAttributeStream(String name) {
		return null;
	}

	@Override
	public Map<String, List<String>> getAttributes() {
		return null;
	}

}
