package com.jd.um.persistence.dao;

import com.jd.common.interfaces.IByNameApi;
import com.jd.um.persistence.model.Principal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IPrincipalJpaDao extends JpaRepository<Principal, Long>, JpaSpecificationExecutor<Principal>, IByNameApi<Principal> {
    //
}
