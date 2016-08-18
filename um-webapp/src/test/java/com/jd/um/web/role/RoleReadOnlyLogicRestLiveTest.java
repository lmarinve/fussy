package com.jd.um.web.role;

import com.jd.um.client.template.PrivilegeTestRestTemplate;
import com.jd.um.client.template.RoleTestRestTemplate;
import com.jd.um.persistence.model.Role;
import com.jd.um.test.live.UmReadOnlyLogicRestLiveTest;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleReadOnlyLogicRestLiveTest extends UmReadOnlyLogicRestLiveTest<Role> {

    @Autowired
    private RoleTestRestTemplate api;
    @Autowired
    private PrivilegeTestRestTemplate associationApi;

    public RoleReadOnlyLogicRestLiveTest() {
        super(Role.class);
    }

    // tests

    // template

    @Override
    protected final RoleTestRestTemplate getApi() {
        return api;
    }

    // util

    final PrivilegeTestRestTemplate getAssociationAPI() {
        return associationApi;
    }

}
