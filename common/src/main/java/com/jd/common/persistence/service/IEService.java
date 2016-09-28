package com.jd.common.persistence.service;

import com.jd.common.interfaces.IByEmailApi;
import com.jd.common.persistence.model.IEmailableEntity;

public interface IEService<Z extends IEmailableEntity> extends IRawEService<Z>, IByEmailApi<Z> {

    //

}
