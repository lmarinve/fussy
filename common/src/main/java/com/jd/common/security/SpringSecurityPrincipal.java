package com.jd.common.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public final class SpringSecurityPrincipal extends User {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String uuid;

    public SpringSecurityPrincipal(final String username, final String password, final boolean enabled, final Collection<? extends GrantedAuthority> authorities, final String uuidToSet) {
        super(username, password, enabled, true, true, true, authorities);

        uuid = uuidToSet;
    }

    // API

    public final String getUuid() {
        return uuid;
    }

}