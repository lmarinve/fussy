package com.jd.um.service;

import com.jd.common.persistence.service.IEService;
import com.jd.um.web.dto.UserDto;

public interface IUserService extends IEService<UserDto> {

    UserDto getCurrentUser();

}
