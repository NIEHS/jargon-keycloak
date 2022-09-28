/**
 * 
 */
package org.irods.jargon.keycloak.adapter.auth;

import org.keycloak.storage.UserStorageProvider;

/**
 * @author conwaymc
 * Provides an implementation of a Keycloak provider that can provide user managment for an underlying iRODS server
 *
 */
public class IrodsAuthStorageProvider implements UserStorageProvider {

	/**
	 * 
	 */
	public IrodsAuthStorageProvider() {
	}

	@Override
	public void close() {
		
	}

}
