/**
 * 
 */
package org.irods.jargon.keycloak.adapter.auth;

import org.irods.jargon.core.exception.JargonException;
import org.irods.jargon.core.exception.JargonRuntimeException;
import org.irods.jargon.core.pub.BulkFileOperationsAOImpl;
import org.irods.jargon.core.pub.IRODSFileSystem;
import org.keycloak.credential.CredentialInput;
import org.keycloak.credential.CredentialInputValidator;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;
import org.keycloak.storage.UserStorageProvider;
import org.keycloak.storage.user.UserLookupProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author conwaymc
 * Provides an implementation of a Keycloak provider that can provide user managment for an underlying iRODS server
 *
 */
public class IrodsAuthStorageProvider implements UserStorageProvider, UserLookupProvider, CredentialInputValidator {
	
	private IrodsAuthStorageProviderConfig irodsAuthStorageProviderConfig;
	private IRODSFileSystem irodsFileSystem;
	public static final Logger log = LoggerFactory.getLogger(IrodsAuthStorageProvider.class);


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
		try {
			this.irodsFileSystem = IRODSFileSystem.instance();
		} catch (JargonException e) {
			log.error("Unable to create IRODSFileSystem", e);
			throw new JargonRuntimeException("error creating IRODSFileSystem", e);
		}
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
