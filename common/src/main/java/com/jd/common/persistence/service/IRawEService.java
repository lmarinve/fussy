package com.jd.common.persistence.service;

import com.jd.common.interfaces.IOperations;
import com.jd.common.persistence.model.IEntity;
import org.springframework.data.domain.Page;

public interface IRawEService<Z extends IEntity> extends IOperations<Z> {

    Page<Z> findAllPaginatedAndSortedRaw(final int page, final int size, final String sortBy, final String sortOrder);

}
