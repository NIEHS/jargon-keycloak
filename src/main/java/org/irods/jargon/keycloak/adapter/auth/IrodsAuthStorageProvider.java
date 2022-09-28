/**
 * 
 */
package org.irods.jargon.keycloak.adapter.auth;

import org.keycloak.credential.CredentialInput;
import org.keycloak.credential.CredentialInputValidator;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;
import org.keycloak.storage.UserStorageProvider;
import org.keycloak.storage.user.UserLookupProvider;

/**
 * @author conwaymc
 * Provides an implementation of a Keycloak provider that can provide user managment for an underlying iRODS server
 *
 */
public class IrodsAuthStorageProvider implements UserStorageProvider, UserLookupProvider, CredentialInputValidator {
	
	private IrodsAuthStorageProviderConfig irodsAuthStorageProviderConfig;

	public IrodsAuthStorageProviderConfig getIrodsAuthStorageProviderConfig() {
		return irodsAuthStorageProviderConfig;
	}

	public void setIrodsAuthStorageProviderConfig(IrodsAuthStorageProviderConfig irodsAuthStorageProviderConfig) {
		this.irodsAuthStorageProviderConfig = irodsAuthStorageProviderConfig;
	}

	/**
	 * 
	 */
	public IrodsAuthStorageProvider(final IrodsAuthStorageProviderConfig irodsAuthStorageProviderConfig) {
		if (irodsAuthStorageProviderConfig == null) {
			throw new IllegalArgumentException("null irodsAuthStorageProviderConfig");
		}
		
		this.irodsAuthStorageProviderConfig = irodsAuthStorageProviderConfig;
	}

	@Override
	public void close() {
		
	}

	@Override
	public UserModel getUserById(String id, RealmModel realm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel getUserByUsername(String username, RealmModel realm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel getUserByEmail(String email, RealmModel realm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean supportsCredentialType(String credentialType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isConfiguredFor(RealmModel realm, UserModel user, String credentialType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isValid(RealmModel realm, UserModel user, CredentialInput credentialInput) {
		// TODO Auto-generated method stub
		return false;
	}

}
