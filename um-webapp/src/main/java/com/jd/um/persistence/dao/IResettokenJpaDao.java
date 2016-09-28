package com.jd.um.persistence.dao;

import com.jd.um.persistence.model.Resettoken;
import com.jd.common.interfaces.IByNameApi;
import com.jd.um.persistence.model.Principal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IResettokenJpaDao extends JpaRepository<Resettoken, Long>, JpaSpecificationExecutor<Resettoken>, IByNameApi<Resettoken>
{

    Resettoken findByName(String name);

    Resettoken findByUser(Principal user);

}
