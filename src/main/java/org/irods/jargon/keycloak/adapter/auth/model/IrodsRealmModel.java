/**
 * 
 */
package org.irods.jargon.keycloak.adapter.auth.model;

import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import org.keycloak.common.enums.SslRequired;
import org.keycloak.component.ComponentModel;
import org.keycloak.models.AuthenticationExecutionModel;
import org.keycloak.models.AuthenticationFlowModel;
import org.keycloak.models.AuthenticatorConfigModel;
import org.keycloak.models.CibaConfig;
import org.keycloak.models.ClientInitialAccessModel;
import org.keycloak.models.ClientModel;
import org.keycloak.models.ClientScopeModel;
import org.keycloak.models.GroupModel;
import org.keycloak.models.IdentityProviderMapperModel;
import org.keycloak.models.IdentityProviderModel;
import org.keycloak.models.OAuth2DeviceConfig;
import org.keycloak.models.OTPPolicy;
import org.keycloak.models.ParConfig;
import org.keycloak.models.PasswordPolicy;
import org.keycloak.models.RealmModel;
import org.keycloak.models.RequiredActionProviderModel;
import org.keycloak.models.RequiredCredentialModel;
import org.keycloak.models.RoleModel;
import org.keycloak.models.WebAuthnPolicy;

/**
 * Realm model adaptation for iRODS
 * 
 * @author conwaymc
 *
 */
public class IrodsRealmModel implements RealmModel {

	/**
	 * 
	 */
	public IrodsRealmModel() {
	}

	@Override
	public RoleModel getRole(String name) {
		return null;
	}

	@Override
	public RoleModel addRole(String name) {
		return null;
	}

	@Override
	public RoleModel addRole(String id, String name) {
		return null;
	}

	@Override
	public boolean removeRole(RoleModel role) {
		return false;
	}

	@Override
	public Stream<RoleModel> getRolesStream() {
		return null;
	}

	@Override
	public Stream<RoleModel> getRolesStream(Integer firstResult, Integer maxResults) {
		return null;
	}

	@Override
	public Stream<RoleModel> searchForRolesStream(String search, Integer first, Integer max) {
		return null;
	}

	@Override
	public Stream<String> getDefaultRolesStream() {
		return null;
	}

	@Override
	public void addDefaultRole(String name) {

	}

	@Override
	public void removeDefaultRoles(String... defaultRoles) {

	}

	@Override
	public String getId() {
		return null;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public void setName(String name) {

	}

	@Override
	public String getDisplayName() {
		return null;
	}

	@Override
	public void setDisplayName(String displayName) {

	}

	@Override
	public String getDisplayNameHtml() {
		return null;
	}

	@Override
	public void setDisplayNameHtml(String displayNameHtml) {

	}

	@Override
	public boolean isEnabled() {
		return false;
	}

	@Override
	public void setEnabled(boolean enabled) {

	}

	@Override
	public SslRequired getSslRequired() {
		return null;
	}

	@Override
	public void setSslRequired(SslRequired sslRequired) {

	}

	@Override
	public boolean isRegistrationAllowed() {
		return false;
	}

	@Override
	public void setRegistrationAllowed(boolean registrationAllowed) {

	}

	@Override
	public boolean isRegistrationEmailAsUsername() {
		return false;
	}

	@Override
	public void setRegistrationEmailAsUsername(boolean registrationEmailAsUsername) {

	}

	@Override
	public boolean isRememberMe() {
		return false;
	}

	@Override
	public void setRememberMe(boolean rememberMe) {

	}

	@Override
	public boolean isEditUsernameAllowed() {
		return false;
	}

	@Override
	public void setEditUsernameAllowed(boolean editUsernameAllowed) {

	}

	@Override
	public boolean isUserManagedAccessAllowed() {
		return false;
	}

	@Override
	public void setUserManagedAccessAllowed(boolean userManagedAccessAllowed) {

	}

	@Override
	public void setAttribute(String name, String value) {

	}

	@Override
	public void removeAttribute(String name) {

	}

	@Override
	public String getAttribute(String name) {
		return null;
	}

	@Override
	public Map<String, String> getAttributes() {
		return null;
	}

	@Override
	public boolean isBruteForceProtected() {
		return false;
	}

	@Override
	public void setBruteForceProtected(boolean value) {

	}

	@Override
	public boolean isPermanentLockout() {
		return false;
	}

	@Override
	public void setPermanentLockout(boolean val) {

	}

	@Override
	public int getMaxFailureWaitSeconds() {
		return 0;
	}

	@Override
	public void setMaxFailureWaitSeconds(int val) {

	}

	@Override
	public int getWaitIncrementSeconds() {
		return 0;
	}

	@Override
	public void setWaitIncrementSeconds(int val) {

	}

	@Override
	public int getMinimumQuickLoginWaitSeconds() {
		return 0;
	}

	@Override
	public void setMinimumQuickLoginWaitSeconds(int val) {

	}

	@Override
	public long getQuickLoginCheckMilliSeconds() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setQuickLoginCheckMilliSeconds(long val) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getMaxDeltaTimeSeconds() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMaxDeltaTimeSeconds(int val) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getFailureFactor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFailureFactor(int failureFactor) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isVerifyEmail() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setVerifyEmail(boolean verifyEmail) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLoginWithEmailAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setLoginWithEmailAllowed(boolean loginWithEmailAllowed) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isDuplicateEmailsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDuplicateEmailsAllowed(boolean duplicateEmailsAllowed) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isResetPasswordAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setResetPasswordAllowed(boolean resetPasswordAllowed) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDefaultSignatureAlgorithm() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDefaultSignatureAlgorithm(String defaultSignatureAlgorithm) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isRevokeRefreshToken() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setRevokeRefreshToken(boolean revokeRefreshToken) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getRefreshTokenMaxReuse() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setRefreshTokenMaxReuse(int revokeRefreshTokenCount) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getSsoSessionIdleTimeout() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSsoSessionIdleTimeout(int seconds) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getSsoSessionMaxLifespan() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSsoSessionMaxLifespan(int seconds) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getSsoSessionIdleTimeoutRememberMe() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSsoSessionIdleTimeoutRememberMe(int seconds) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getSsoSessionMaxLifespanRememberMe() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSsoSessionMaxLifespanRememberMe(int seconds) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getOfflineSessionIdleTimeout() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setOfflineSessionIdleTimeout(int seconds) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getAccessTokenLifespan() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isOfflineSessionMaxLifespanEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setOfflineSessionMaxLifespanEnabled(boolean offlineSessionMaxLifespanEnabled) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getOfflineSessionMaxLifespan() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setOfflineSessionMaxLifespan(int seconds) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getClientSessionIdleTimeout() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setClientSessionIdleTimeout(int seconds) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getClientSessionMaxLifespan() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setClientSessionMaxLifespan(int seconds) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getClientOfflineSessionIdleTimeout() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setClientOfflineSessionIdleTimeout(int seconds) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getClientOfflineSessionMaxLifespan() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setClientOfflineSessionMaxLifespan(int seconds) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAccessTokenLifespan(int seconds) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getAccessTokenLifespanForImplicitFlow() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAccessTokenLifespanForImplicitFlow(int seconds) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getAccessCodeLifespan() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAccessCodeLifespan(int seconds) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getAccessCodeLifespanUserAction() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAccessCodeLifespanUserAction(int seconds) {
		// TODO Auto-generated method stub

	}

	@Override
	public OAuth2DeviceConfig getOAuth2DeviceConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CibaConfig getCibaPolicy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParConfig getParPolicy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Integer> getUserActionTokenLifespans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAccessCodeLifespanLogin() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAccessCodeLifespanLogin(int seconds) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getActionTokenGeneratedByAdminLifespan() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setActionTokenGeneratedByAdminLifespan(int seconds) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getActionTokenGeneratedByUserLifespan() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setActionTokenGeneratedByUserLifespan(int seconds) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getActionTokenGeneratedByUserLifespan(String actionTokenType) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setActionTokenGeneratedByUserLifespan(String actionTokenType, Integer seconds) {
		// TODO Auto-generated method stub

	}

	@Override
	public Stream<RequiredCredentialModel> getRequiredCredentialsStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addRequiredCredential(String cred) {
		// TODO Auto-generated method stub

	}

	@Override
	public PasswordPolicy getPasswordPolicy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPasswordPolicy(PasswordPolicy policy) {
		// TODO Auto-generated method stub

	}

	@Override
	public OTPPolicy getOTPPolicy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOTPPolicy(OTPPolicy policy) {
		// TODO Auto-generated method stub

	}

	@Override
	public WebAuthnPolicy getWebAuthnPolicy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setWebAuthnPolicy(WebAuthnPolicy policy) {
		// TODO Auto-generated method stub

	}

	@Override
	public WebAuthnPolicy getWebAuthnPolicyPasswordless() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setWebAuthnPolicyPasswordless(WebAuthnPolicy policy) {
		// TODO Auto-generated method stub

	}

	@Override
	public RoleModel getRoleById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<GroupModel> getDefaultGroupsStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addDefaultGroup(GroupModel group) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeDefaultGroup(GroupModel group) {
		// TODO Auto-generated method stub

	}

	@Override
	public Stream<ClientModel> getClientsStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<ClientModel> getClientsStream(Integer firstResult, Integer maxResults) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getClientsCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<ClientModel> getAlwaysDisplayInConsoleClientsStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientModel addClient(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientModel addClient(String id, String clientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeClient(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ClientModel getClientById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientModel getClientByClientId(String clientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<ClientModel> searchClientByClientIdStream(String clientId, Integer firstResult, Integer maxResults) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<ClientModel> searchClientByAttributes(Map<String, String> attributes, Integer firstResult,
			Integer maxResults) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateRequiredCredentials(Set<String> creds) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, String> getBrowserSecurityHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBrowserSecurityHeaders(Map<String, String> headers) {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, String> getSmtpConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSmtpConfig(Map<String, String> smtpConfig) {
		// TODO Auto-generated method stub

	}

	@Override
	public AuthenticationFlowModel getBrowserFlow() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBrowserFlow(AuthenticationFlowModel flow) {
		// TODO Auto-generated method stub

	}

	@Override
	public AuthenticationFlowModel getRegistrationFlow() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRegistrationFlow(AuthenticationFlowModel flow) {
		// TODO Auto-generated method stub

	}

	@Override
	public AuthenticationFlowModel getDirectGrantFlow() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDirectGrantFlow(AuthenticationFlowModel flow) {
		// TODO Auto-generated method stub

	}

	@Override
	public AuthenticationFlowModel getResetCredentialsFlow() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setResetCredentialsFlow(AuthenticationFlowModel flow) {
		// TODO Auto-generated method stub

	}

	@Override
	public AuthenticationFlowModel getClientAuthenticationFlow() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setClientAuthenticationFlow(AuthenticationFlowModel flow) {
		// TODO Auto-generated method stub

	}

	@Override
	public AuthenticationFlowModel getDockerAuthenticationFlow() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDockerAuthenticationFlow(AuthenticationFlowModel flow) {
		// TODO Auto-generated method stub

	}

	@Override
	public Stream<AuthenticationFlowModel> getAuthenticationFlowsStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthenticationFlowModel getFlowByAlias(String alias) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthenticationFlowModel addAuthenticationFlow(AuthenticationFlowModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthenticationFlowModel getAuthenticationFlowById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAuthenticationFlow(AuthenticationFlowModel model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAuthenticationFlow(AuthenticationFlowModel model) {
		// TODO Auto-generated method stub

	}

	@Override
	public Stream<AuthenticationExecutionModel> getAuthenticationExecutionsStream(String flowId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthenticationExecutionModel getAuthenticationExecutionById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthenticationExecutionModel getAuthenticationExecutionByFlowId(String flowId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthenticationExecutionModel addAuthenticatorExecution(AuthenticationExecutionModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAuthenticatorExecution(AuthenticationExecutionModel model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeAuthenticatorExecution(AuthenticationExecutionModel model) {
		// TODO Auto-generated method stub

	}

	@Override
	public Stream<AuthenticatorConfigModel> getAuthenticatorConfigsStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthenticatorConfigModel addAuthenticatorConfig(AuthenticatorConfigModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAuthenticatorConfig(AuthenticatorConfigModel model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeAuthenticatorConfig(AuthenticatorConfigModel model) {
		// TODO Auto-generated method stub

	}

	@Override
	public AuthenticatorConfigModel getAuthenticatorConfigById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthenticatorConfigModel getAuthenticatorConfigByAlias(String alias) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<RequiredActionProviderModel> getRequiredActionProvidersStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RequiredActionProviderModel addRequiredActionProvider(RequiredActionProviderModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateRequiredActionProvider(RequiredActionProviderModel model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeRequiredActionProvider(RequiredActionProviderModel model) {
		// TODO Auto-generated method stub

	}

	@Override
	public RequiredActionProviderModel getRequiredActionProviderById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RequiredActionProviderModel getRequiredActionProviderByAlias(String alias) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<IdentityProviderModel> getIdentityProvidersStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IdentityProviderModel getIdentityProviderByAlias(String alias) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addIdentityProvider(IdentityProviderModel identityProvider) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeIdentityProviderByAlias(String alias) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateIdentityProvider(IdentityProviderModel identityProvider) {
		// TODO Auto-generated method stub

	}

	@Override
	public Stream<IdentityProviderMapperModel> getIdentityProviderMappersStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<IdentityProviderMapperModel> getIdentityProviderMappersByAliasStream(String brokerAlias) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IdentityProviderMapperModel addIdentityProviderMapper(IdentityProviderMapperModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeIdentityProviderMapper(IdentityProviderMapperModel mapping) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateIdentityProviderMapper(IdentityProviderMapperModel mapping) {
		// TODO Auto-generated method stub

	}

	@Override
	public IdentityProviderMapperModel getIdentityProviderMapperById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IdentityProviderMapperModel getIdentityProviderMapperByName(String brokerAlias, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComponentModel addComponentModel(ComponentModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComponentModel importComponentModel(ComponentModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateComponent(ComponentModel component) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeComponent(ComponentModel component) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeComponents(String parentId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Stream<ComponentModel> getComponentsStream(String parentId, String providerType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<ComponentModel> getComponentsStream(String parentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<ComponentModel> getComponentsStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComponentModel getComponent(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLoginTheme() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLoginTheme(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAccountTheme() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAccountTheme(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAdminTheme() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAdminTheme(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getEmailTheme() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEmailTheme(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getNotBefore() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setNotBefore(int notBefore) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEventsEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setEventsEnabled(boolean enabled) {
		// TODO Auto-generated method stub

	}

	@Override
	public long getEventsExpiration() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setEventsExpiration(long expiration) {
		// TODO Auto-generated method stub

	}

	@Override
	public Stream<String> getEventsListenersStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEventsListeners(Set<String> listeners) {
		// TODO Auto-generated method stub

	}

	@Override
	public Stream<String> getEnabledEventTypesStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEnabledEventTypes(Set<String> enabledEventTypes) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isAdminEventsEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setAdminEventsEnabled(boolean enabled) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isAdminEventsDetailsEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setAdminEventsDetailsEnabled(boolean enabled) {
		// TODO Auto-generated method stub

	}

	@Override
	public ClientModel getMasterAdminClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMasterAdminClient(ClientModel client) {
		// TODO Auto-generated method stub

	}

	@Override
	public RoleModel getDefaultRole() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDefaultRole(RoleModel role) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isIdentityFederationEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInternationalizationEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setInternationalizationEnabled(boolean enabled) {
		// TODO Auto-generated method stub

	}

	@Override
	public Stream<String> getSupportedLocalesStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSupportedLocales(Set<String> locales) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDefaultLocale() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDefaultLocale(String locale) {
		// TODO Auto-generated method stub

	}

	@Override
	public GroupModel createGroup(String id, String name, GroupModel toParent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GroupModel getGroupById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<GroupModel> getGroupsStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getGroupsCount(Boolean onlyTopGroups) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getGroupsCountByNameContaining(String search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<GroupModel> getTopLevelGroupsStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<GroupModel> getTopLevelGroupsStream(Integer first, Integer max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<GroupModel> searchForGroupByNameStream(String search, Integer first, Integer max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeGroup(GroupModel group) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void moveGroup(GroupModel group, GroupModel toParent) {
		// TODO Auto-generated method stub

	}

	@Override
	public Stream<ClientScopeModel> getClientScopesStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientScopeModel addClientScope(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientScopeModel addClientScope(String id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeClientScope(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ClientScopeModel getClientScopeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addDefaultClientScope(ClientScopeModel clientScope, boolean defaultScope) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeDefaultClientScope(ClientScopeModel clientScope) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createOrUpdateRealmLocalizationTexts(String locale, Map<String, String> localizationTexts) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean removeRealmLocalizationTexts(String locale) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<String, Map<String, String>> getRealmLocalizationTexts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getRealmLocalizationTextsByLocale(String locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<ClientScopeModel> getDefaultClientScopesStream(boolean defaultScope) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientInitialAccessModel createClientInitialAccessModel(int expiration, int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientInitialAccessModel getClientInitialAccessModel(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeClientInitialAccessModel(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Stream<ClientInitialAccessModel> getClientInitialAccesses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void decreaseRemainingCount(ClientInitialAccessModel clientInitialAccess) {
		// TODO Auto-generated method stub

	}

}
