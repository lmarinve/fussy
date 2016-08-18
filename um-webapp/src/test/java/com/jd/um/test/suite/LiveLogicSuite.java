package com.jd.um.test.suite;

import com.jd.um.security.AuthenticationRestLiveTest;
import com.jd.um.web.privilege.PrivilegeLogicRestLiveTest;
import com.jd.um.web.privilege.PrivilegeReadOnlyLogicRestLiveTest;
import com.jd.um.web.role.RoleLogicRestLiveTest;
import com.jd.um.web.role.RoleReadOnlyLogicRestLiveTest;
import com.jd.um.web.user.UserLogicRestLiveTest;
import com.jd.um.web.user.UserReadOnlyLogicRestLiveTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ // @formatter:off
    UserLogicRestLiveTest.class,
    UserReadOnlyLogicRestLiveTest.class,

    RoleLogicRestLiveTest.class,
    RoleReadOnlyLogicRestLiveTest.class,

    PrivilegeReadOnlyLogicRestLiveTest.class,
    PrivilegeLogicRestLiveTest.class,

    AuthenticationRestLiveTest.class
})
// @formatter:off
public final class LiveLogicSuite {
    //
}
