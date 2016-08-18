package com.jd.um.test.suite;

import com.jd.um.security.SecurityRestLiveTest;
import com.jd.um.web.role.RoleSimpleLiveTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ // @formatter:off
    LiveLogicSuite.class,
    SecurityRestLiveTest.class,
    RoleSimpleLiveTest.class
})
// @formatter:on
public final class LiveSuite {
    //
}
