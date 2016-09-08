package com.jd.um.service;

import com.jd.common.persistence.service.IService;
import com.jd.um.web.dto.UserDto;

public interface IUserService extends IService<UserDto> {

    UserDto getCurrentUser();

}
