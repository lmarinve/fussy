package com.jd.common.web;

import com.jd.common.persistence.model.IEntity;

public interface IUriMapper {

    <T extends IEntity> String getUriBase(final Class<T> clazz);

}
