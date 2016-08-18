package com.jd.um.test.suite;

import com.jd.um.service.main.PrincipalServiceIntegrationTest;
import com.jd.um.service.main.PrivilegeServiceIntegrationTest;
import com.jd.um.service.main.RoleServiceIntegrationTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ // @formatter:off
    PrincipalServiceIntegrationTest.class,
    PrivilegeServiceIntegrationTest.class,
    RoleServiceIntegrationTest.class
})
// @formatter:on
public final class ServiceSuite {
    //
}
