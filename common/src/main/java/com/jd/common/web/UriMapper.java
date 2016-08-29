package com.jd.common.web;

import com.jd.common.persistence.model.IEntity;
import org.springframework.stereotype.Component;

@Component
public class UriMapper implements IUriMapper {

    public UriMapper() {
        super();
    }

    // API

    /**
     * - note: at this point, the URI is transformed into plural (added `s`) in a hardcoded way - this will change in the future
     */
    @Override
    public <T extends IEntity> String getUriBase(final Class<T> clazz) {
        return clazz.getSimpleName().toString().toLowerCase() + "s";
    }

}
