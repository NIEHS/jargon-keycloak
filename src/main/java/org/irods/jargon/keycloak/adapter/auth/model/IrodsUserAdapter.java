/**
 * 
 */
package org.irods.jargon.keycloak.adapter.auth.model;

import org.keycloak.component.ComponentModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.SubjectCredentialManager;
import org.keycloak.storage.adapter.AbstractUserAdapter;

/**
 * User adapter implementation for iRODS
 * @author conwaymc
 *
 */
public class IrodsUserAdapter extends AbstractUserAdapter {

	/**
	 * @param session
	 * @param realm
	 * @param storageProviderModel
	 */
	public IrodsUserAdapter(KeycloakSession session, RealmModel realm, ComponentModel storageProviderModel) {
		super(session, realm, storageProviderModel);
	}

	@Override
	public String getUsername() {
		return null;
	}

	@Override
	public SubjectCredentialManager credentialManager() {
		return null;
	}

}
