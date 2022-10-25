package org.irods.jargon.keycloak.adapter.auth;

import static org.junit.Assert.*;

import java.util.Properties;

import org.irods.jargon.core.pub.IRODSFileSystem;
import org.irods.jargon.testutils.TestingPropertiesHelper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.keycloak.component.ComponentModel;
import org.keycloak.models.KeycloakSession;
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
	public void testGetUserById() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUserByUsername() {
		IrodsAuthStorageProviderFactory irodsAuthStorageProviderFactory = new IrodsAuthStorageProviderFactory();
		KeycloakSession mockKeycloakSession = Mockito.mock(KeycloakSession.class);
		ComponentModel mockComponentModel = Mockito.mock(ComponentModel.class);
		IrodsAuthStorageProvider irodsAuthStorageProvider =  irodsAuthStorageProviderFactory.create(mockKeycloakSession, mockComponentModel);
		RealmModel realmModel
		
		irodsAuthStorageProvider.getUserByUsername(null, null)
	
	
	}

	@Test
	public void testGetUserByEmail() {
		fail("Not yet implemented");
	}

	@Test
	public void testSupportsCredentialType() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsConfiguredFor() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsValid() {
		fail("Not yet implemented");
	}

}
