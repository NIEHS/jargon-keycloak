package org.irods.jargon.keycloak.adapter.auth;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.keycloak.component.ComponentModel;
import org.keycloak.models.KeycloakSession;
import org.mockito.Mockito;

public class IrodsAuthStorageProviderFactoryTest {

	@Test
	public void testCreate() {
		IrodsAuthStorageProviderFactory irodsAuthStorageProviderFactory = new IrodsAuthStorageProviderFactory();
		KeycloakSession mockKeycloakSession = Mockito.mock(KeycloakSession.class);
		ComponentModel mockComponentModel = Mockito.mock(ComponentModel.class);
		IrodsAuthStorageProvider actual =  irodsAuthStorageProviderFactory.create(mockKeycloakSession, mockComponentModel);
		Assert.assertNotNull(actual);
	}

	@Test
	public void testGetId() {
		IrodsAuthStorageProviderFactory irodsAuthStorageProviderFactory = new IrodsAuthStorageProviderFactory();
		String actual = irodsAuthStorageProviderFactory.getId();
		Assert.assertEquals("irods", actual);
	}

}
