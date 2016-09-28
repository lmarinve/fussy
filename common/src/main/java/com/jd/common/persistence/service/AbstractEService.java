package com.jd.common.persistence.service;

import com.jd.common.persistence.model.IEmailableEntity;

public abstract class AbstractEService<Z extends IEmailableEntity> extends AbstractRawService<Z> implements IEService<Z> {

    public AbstractEService() {
        super();
    }

    // API

}
