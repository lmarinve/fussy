package com.jd.um.model;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import com.jd.client.IDtoOperations;
import com.jd.um.persistence.model.Privilege;
import com.jd.um.persistence.model.Role;
import org.springframework.stereotype.Component;

import com.google.common.collect.Sets;

@Component
public final class RoleDtoOpsImpl implements IDtoOperations<Role> {

    public RoleDtoOpsImpl() {
        super();
    }

    // API

    public final Role createNewEntity(final String name) {
        return new Role(name, Sets.<Privilege> newHashSet());
    }

    // template

    @Override
    public final Role createNewResource() {
        return new Role(randomAlphabetic(8), Sets.<Privilege> newHashSet());
    }

    @Override
    public final void invalidate(final Role entity) {
        entity.setName(null);
    }

    @Override
    public final void change(final Role resource) {
        resource.setName(randomAlphabetic(8));
    }

}
