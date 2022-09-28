/**
 * 
 */
package org.irods.jargon.keycloak.adapter.auth;

import org.irods.jargon.core.connection.AuthScheme;

/**
 * Configuration for an iRODS storage provider for Keycloak
 * @author conwaymc
 *
 */
public class IrodsAuthStorageProviderConfig {
	
	private String serverName = "localhost";
	private int port = 1247;
	private String zone = "tempZone";
	private String adminUserName = "rods";
	private String adminPassword = "rods";
	private AuthScheme authMethod = AuthScheme.STANDARD;
	private String providerId = "irods";
	
	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getAdminUserName() {
		return adminUserName;
	}

	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public AuthScheme getAuthMethod() {
		return authMethod;
	}

	public void setAuthMethod(AuthScheme authMethod) {
		this.authMethod = authMethod;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	

	/**
	 * 
	 */
	public IrodsAuthStorageProviderConfig() {
	}

}
