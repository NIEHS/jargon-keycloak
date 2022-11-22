/**
 * 
 */
package org.irods.jargon.keycloak.adapter.auth.model;

import org.irods.jargon.core.pub.domain.User;
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
public class IrodsUserModel extends AbstractUserAdapter {
	
	private final User irodsUser;

	public IrodsUserModel(KeycloakSession session, RealmModel realm, ComponentModel storageProviderModel, User irodsUser) {
		super(session, realm, storageProviderModel);
		this.irodsUser = irodsUser;
	}

	@Override
	public String getUsername() {
		return irodsUser.getName();
	}

	@Override
	public SubjectCredentialManager credentialManager() {
		return null;
	}

}
