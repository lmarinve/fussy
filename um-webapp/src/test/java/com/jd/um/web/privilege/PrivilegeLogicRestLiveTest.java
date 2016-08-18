package com.jd.um.web.privilege;

import com.jd.client.IDtoOperations;
import com.jd.um.client.template.PrivilegeTestRestTemplate;
import com.jd.um.model.PrivilegeDtoOpsImpl;
import com.jd.um.persistence.model.Privilege;
import com.jd.um.test.live.UmLogicRestLiveTest;
import org.springframework.beans.factory.annotation.Autowired;

public class PrivilegeLogicRestLiveTest extends UmLogicRestLiveTest<Privilege> {

    @Autowired
    private PrivilegeTestRestTemplate api;
    @Autowired
    private PrivilegeDtoOpsImpl entityOps;

    public PrivilegeLogicRestLiveTest() {
        super(Privilege.class);
    }

    // tests

    // template

    @Override
    protected final PrivilegeTestRestTemplate getApi() {
        return api;
    }

    @Override
    protected final IDtoOperations<Privilege> getEntityOps() {
        return entityOps;
    }

}
