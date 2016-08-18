package com.jd.um.model;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import com.jd.client.IDtoOperations;
import com.jd.um.client.FixtureResourceFactory;
import com.jd.um.persistence.model.Principal;
import org.springframework.stereotype.Component;

@Component
public final class PrincipalDtoOpsImpl implements IDtoOperations<Principal> {

    public PrincipalDtoOpsImpl() {
        super();
    }

    // API

    // template method

    @Override
    public final Principal createNewResource() {
        return FixtureResourceFactory.createNewPrincipal();
    }

    @Override
    public final void invalidate(final Principal entity) {
        entity.setName(null);
    }

    @Override
    public final void change(final Principal resource) {
        resource.setName(randomAlphabetic(8));
    }

}
