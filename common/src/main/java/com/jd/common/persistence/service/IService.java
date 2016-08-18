package com.jd.common.persistence.service;

import com.jd.common.interfaces.IByNameApi;
import com.jd.common.persistence.model.INameableEntity;

public interface IService<T extends INameableEntity> extends IRawService<T>, IByNameApi<T> {

    //

}
