package com.jd.um.web.user;

import com.jd.um.client.template.UserTestRestTemplate;
import com.jd.um.test.live.UmReadOnlyLogicRestLiveTest;
import com.jd.um.web.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;

public class UserReadOnlyLogicRestLiveTest extends UmReadOnlyLogicRestLiveTest<UserDto> {

    @Autowired
    private UserTestRestTemplate api;

    public UserReadOnlyLogicRestLiveTest() {
        super(UserDto.class);
    }

    // tests

    // template method

    @Override
    protected final UserTestRestTemplate getApi() {
        return api;
    }

}
