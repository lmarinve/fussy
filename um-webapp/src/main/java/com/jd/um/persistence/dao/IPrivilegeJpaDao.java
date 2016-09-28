package com.jd.um.persistence.dao;

import com.jd.common.interfaces.IByNameApi;
import com.jd.um.persistence.model.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IPrivilegeJpaDao extends JpaRepository<Privilege, Long>, JpaSpecificationExecutor<Privilege>, IByNameApi<Privilege> {
    //
    Privilege findByName(String name);

    @Override
    void delete(Privilege privilege);

}
