package com.jd.um.persistence.dao;

import com.jd.common.interfaces.IByNameApi;
import com.jd.um.persistence.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IRoleJpaDao extends JpaRepository<Role, Long>, JpaSpecificationExecutor<Role>, IByNameApi<Role> {

	//
    Role findByName(String name);

    @Override
    void delete(Role roles);

}
