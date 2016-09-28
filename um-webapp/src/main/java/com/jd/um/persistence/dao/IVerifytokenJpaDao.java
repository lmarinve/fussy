package com.jd.um.persistence.dao;

import com.jd.common.interfaces.IByNameApi;
import com.jd.um.persistence.model.Principal;
import com.jd.um.persistence.model.Verifytoken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IVerifytokenJpaDao extends JpaRepository<Verifytoken, Long>, JpaSpecificationExecutor<Verifytoken>, IByNameApi<Verifytoken> {

    Verifytoken findByName(String name);

    Verifytoken findByUser(Principal user);

}
