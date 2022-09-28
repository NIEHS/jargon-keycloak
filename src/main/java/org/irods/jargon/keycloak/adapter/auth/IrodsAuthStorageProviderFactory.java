package org.irods.jargon.keycloak.adapter.auth;

import org.keycloak.component.ComponentModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.storage.UserStorageProviderFactory;

/**
 * Factory for Irods auth storage
 * @author conwaymc
 *
 */
public class IrodsAuthStorageProviderFactory implements UserStorageProviderFactory<IrodsAuthStorageProvider> {

	/**
	 * FIXME: derive this config from a properties file
	 */
	private IrodsAuthStorageProviderConfig irodsAuthStorageProviderConfig = new IrodsAuthStorageProviderConfig();
	
	public IrodsAuthStorageProviderFactory() {
	}
	
	

	@Override
	public IrodsAuthStorageProvider create(KeycloakSession session, ComponentModel model) {
		return new IrodsAuthStorageProvider(irodsAuthStorageProviderConfig);
	}

	@Override
	public String getId() {
		return irodsAuthStorageProviderConfig.getProviderId();
	}

}
