package com.jd.common.web;

import com.jd.common.interfaces.IDto;

public interface IUriMapper {

    <T extends IDto> String getUriBase(final Class<T> clazz);

}
