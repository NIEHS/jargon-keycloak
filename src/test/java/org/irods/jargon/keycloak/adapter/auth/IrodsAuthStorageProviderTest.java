package org.irods.jargon.keycloak.adapter.auth;


import java.util.Properties;

import org.irods.jargon.core.connection.IRODSAccount;
import org.irods.jargon.core.pub.IRODSFileSystem;
import org.irods.jargon.core.pub.UserAO;
import org.irods.jargon.core.pub.domain.User;
import org.irods.jargon.keycloak.adapter.auth.model.IrodsUserModel;
import org.irods.jargon.testutils.TestingPropertiesHelper;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.keycloak.component.ComponentModel;
import org.keycloak.credential.CredentialInput;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;
import org.keycloak.models.credential.PasswordCredentialModel;
import org.mockito.Mockito;

public class IrodsAuthStorageProviderTest {
	
	private static Properties testingProperties = new Properties();
	private static TestingPropertiesHelper testingPropertiesHelper = new TestingPropertiesHelper();
	private static IRODSFileSystem irodsFileSystem = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		TestingPropertiesHelper testingPropertiesLoader = new TestingPropertiesHelper();
		testingProperties = testingPropertiesLoader.getTestProperties();
		irodsFileSystem = IRODSFileSystem.instance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		irodsFileSystem.closeAndEatExceptions();
	}


	
	@Test
	public void testClose() {
		IrodsAuthStorageProviderFactory irodsAuthStorageProviderFactory = new IrodsAuthStorageProviderFactory();
		KeycloakSession mockKeycloakSession = Mockito.mock(KeycloakSession.class);
		ComponentModel mockComponentModel = Mockito.mock(ComponentModel.class);
		IrodsAuthStorageProvider irodsAuthStorageProvider =  irodsAuthStorageProviderFactory.create(mockKeycloakSession, mockComponentModel);	
		irodsAuthStorageProvider.close();
	}

	@Test
	public void testGetUserByUsername() {
		IRODSAccount test1Account = testingPropertiesHelper.buildIRODSAccountFromTestProperties(testingProperties);
		IrodsAuthStorageProviderFactory irodsAuthStorageProviderFactory = new IrodsAuthStorageProviderFactory();
		KeycloakSession mockKeycloakSession = Mockito.mock(KeycloakSession.class);
		ComponentModel mockComponentModel = Mockito.mock(ComponentModel.class);
		IrodsAuthStorageProvider irodsAuthStorageProvider =  irodsAuthStorageProviderFactory.create(mockKeycloakSession, mockComponentModel);
		RealmModel realmModel = Mockito.mock(RealmModel.class);
		UserModel actual = irodsAuthStorageProvider.getUserByUsername(realmModel, test1Account.getUserName());
		Assert.assertNotNull(actual);
	
	}


	@Test
	public void testSupportsCredentialType() {
		
		IrodsAuthStorageProviderFactory irodsAuthStorageProviderFactory = new IrodsAuthStorageProviderFactory();
		KeycloakSession mockKeycloakSession = Mockito.mock(KeycloakSession.class);
		ComponentModel mockComponentModel = Mockito.mock(ComponentModel.class);
		IrodsAuthStorageProvider irodsAuthStorageProvider =  irodsAuthStorageProviderFactory.create(mockKeycloakSession, mockComponentModel);
		boolean supports = irodsAuthStorageProvider.supportsCredentialType(PasswordCredentialModel.TYPE);
		Assert.assertTrue(supports);

	}

	@Test
	public void testIsConfiguredFor() throws Exception {
		RealmModel realmModel = Mockito.mock(RealmModel.class);
		IRODSAccount test1Account = testingPropertiesHelper.buildIRODSAccountFromTestProperties(testingProperties);
		IrodsAuthStorageProviderFactory irodsAuthStorageProviderFactory = new IrodsAuthStorageProviderFactory();
		KeycloakSession mockKeycloakSession = Mockito.mock(KeycloakSession.class);
		ComponentModel mockComponentModel = Mockito.mock(ComponentModel.class);
		UserAO userAO = this.irodsFileSystem.getIRODSAccessObjectFactory().getUserAO(test1Account);
		User user = userAO.findByName(test1Account.getUserName());
		UserModel userModel = new IrodsUserModel(mockKeycloakSession, realmModel, mockComponentModel, user);
		IrodsAuthStorageProvider irodsAuthStorageProvider =  irodsAuthStorageProviderFactory.create(mockKeycloakSession, mockComponentModel);
		boolean configured = irodsAuthStorageProvider.isConfiguredFor(realmModel,  userModel,  PasswordCredentialModel.TYPE);
		Assert.assertTrue(configured);
		
	}

	@Test
	public void testIsValid() throws Exception {
		RealmModel realmModel = Mockito.mock(RealmModel.class);
		IRODSAccount test1Account = testingPropertiesHelper.buildIRODSAccountFromTestProperties(testingProperties);
		IrodsAuthStorageProviderFactory irodsAuthStorageProviderFactory = new IrodsAuthStorageProviderFactory();
		KeycloakSession mockKeycloakSession = Mockito.mock(KeycloakSession.class);
		ComponentModel mockComponentModel = Mockito.mock(ComponentModel.class);
		UserAO userAO = this.irodsFileSystem.getIRODSAccessObjectFactory().getUserAO(test1Account);
		User user = userAO.findByName(test1Account.getUserName());
		UserModel userModel = new IrodsUserModel(mockKeycloakSession, realmModel, mockComponentModel, user);
		IrodsAuthStorageProvider irodsAuthStorageProvider =  irodsAuthStorageProviderFactory.create(mockKeycloakSession, mockComponentModel);
		CredentialInput credentialInput = Mockito.mock(CredentialInput.class);
		Mockito.when(credentialInput.getChallengeResponse()).thenReturn(test1Account.getPassword());
		boolean valid = irodsAuthStorageProvider.isValid(realmModel,  userModel,  credentialInput);
		Assert.assertTrue(valid);
		
	}

}
