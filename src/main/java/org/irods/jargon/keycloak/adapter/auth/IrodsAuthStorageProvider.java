/**
 * 
 */
package org.irods.jargon.keycloak.adapter.auth;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.irods.jargon.core.connection.IRODSAccount;
import org.irods.jargon.core.exception.JargonException;
import org.irods.jargon.core.exception.JargonRuntimeException;
import org.irods.jargon.core.pub.BulkFileOperationsAOImpl;
import org.irods.jargon.core.pub.IRODSFileSystem;
import org.irods.jargon.core.pub.UserAO;
import org.irods.jargon.core.pub.domain.User;
import org.irods.jargon.keycloak.adapter.auth.model.IrodsUserModel;
import org.keycloak.component.ComponentModel;
import org.keycloak.credential.CredentialInput;
import org.keycloak.credential.CredentialInputUpdater;
import org.keycloak.credential.CredentialInputValidator;
import org.keycloak.models.KeycloakSession;
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
public class IrodsAuthStorageProvider implements UserStorageProvider, UserLookupProvider, CredentialInputValidator, CredentialInputUpdater {
	
	private final IrodsAuthStorageProviderConfig irodsAuthStorageProviderConfig;
	@SuppressWarnings("unused")
	private final IRODSFileSystem irodsFileSystem;
	private final IRODSAccount irodsAccount;
	private KeycloakSession session;
    private ComponentModel model;
    protected Map<String, UserModel> loadedUsers = new HashMap<>();

	
	public static final Logger log = LoggerFactory.getLogger(IrodsAuthStorageProvider.class);


	public IrodsAuthStorageProviderConfig getIrodsAuthStorageProviderConfig() {
		return irodsAuthStorageProviderConfig;
	}


	/**
	 * 
	 */
	public IrodsAuthStorageProvider(final IrodsAuthStorageProviderConfig irodsAuthStorageProviderConfig, KeycloakSession session, ComponentModel model) {
		if (irodsAuthStorageProviderConfig == null) {
			throw new IllegalArgumentException("null irodsAuthStorageProviderConfig");
		}
		
		this.irodsAuthStorageProviderConfig = irodsAuthStorageProviderConfig;
		this.session = session;
		this.model = model;
		
		
		try {
			this.irodsFileSystem = IRODSFileSystem.instance();
			this.irodsAccount = IRODSAccount.instance(irodsAuthStorageProviderConfig.getServerName(), irodsAuthStorageProviderConfig.getPort(), irodsAuthStorageProviderConfig.getAdminUserName(),
					irodsAuthStorageProviderConfig.getAdminPassword(), "", irodsAuthStorageProviderConfig.getZone(), "");
			
		
		} catch (JargonException e) {
			log.error("Unable to create IRODSFileSystem", e);
			throw new JargonRuntimeException("error creating IRODSFileSystem", e);
		}
	}

	@Override
	public void close() {
		this.irodsFileSystem.closeAndEatExceptions();
	}

	@Override
	public UserModel getUserById(String id, RealmModel realm) {
		log.info("getUserById()");
		try {
			UserAO userAO = this.irodsFileSystem.getIRODSAccessObjectFactory().getUserAO(this.irodsAccount);
			User user = userAO.findById(id);
			UserModel userModel = new IrodsUserModel(user);
			log.info("found user:{}", user);
			return userModel;
			
		} catch (JargonException e) {
			log.error("error accessing iRODS User info", e);
			throw new JargonRuntimeException("getUserById() error", e);
		}
	}

	@Override
	public UserModel getUserByUsername(String username, RealmModel realm) {
		log.info("getUserByUserName()");

		try {
			UserAO userAO = this.irodsFileSystem.getIRODSAccessObjectFactory().getUserAO(this.irodsAccount);
			User user = userAO.findByName(username);
			UserModel userModel = new IrodsUserModel(user);
			log.info("found user:{}", user);
			return userModel;
			
		} catch (JargonException e) {
			log.error("error accessing iRODS User info", e);
			throw new JargonRuntimeException("getUserById() error", e);
		}
	}

	@Override
	public UserModel getUserByEmail(String email, RealmModel realm) {
		return null;
	}

	@Override
	public boolean supportsCredentialType(String credentialType) {
		log.info("supportsCredentialType()");
		log.info("credentialType:{}", credentialType);

		return true;
	}

	@Override
	public boolean isConfiguredFor(RealmModel realm, UserModel user, String credentialType) {
		log.info("isConfiguredFor()");
		log.info("realm:{}", realm);
		log.info("user:{}", user);
		log.info("credentialType:{}", credentialType);

		return true;

	}

	@Override
	public boolean isValid(RealmModel realm, UserModel user, CredentialInput credentialInput) {
		log.info("isValid()");
		log.info("realm:{}", realm);
		log.info("user:{}", user);
		log.info("credentialInput:{}", credentialInput);

		return true;
	}


	@Override
	public boolean updateCredential(RealmModel realm, UserModel user, CredentialInput input) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void disableCredentialType(RealmModel realm, UserModel user, String credentialType) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Set<String> getDisableableCredentialTypes(RealmModel realm, UserModel user) {
		// TODO Auto-generated method stub
		return null;
	}

}
