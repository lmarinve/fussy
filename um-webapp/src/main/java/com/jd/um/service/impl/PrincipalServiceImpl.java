package com.jd.um.service.impl;

import com.jd.common.persistence.service.AbstractEService;
import com.jd.common.security.SpringSecurityUtil;
import com.jd.um.persistence.dao.IPrincipalJpaDao;
import com.jd.um.persistence.model.Principal;
import com.jd.um.service.IPrincipalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PrincipalServiceImpl extends AbstractEService<Principal> implements IPrincipalService {

    @Autowired
    private IPrincipalJpaDao dao;

    public PrincipalServiceImpl() {
        super();
    }

    // API

    // find

    @Override
    @Transactional(readOnly = true)
    public Principal findByEmail(final String email) {
        return dao.findByEmail(email);
    }

    // other

    @Override
    @Transactional(readOnly = true)
    public Principal getCurrentPrincipal() {
        final String principalEmail = SpringSecurityUtil.getNameOfCurrentPrincipal();
        return getDao().findByEmail(principalEmail);
    }

    // Spring

    @Override
    protected final IPrincipalJpaDao getDao() {
        return dao;
    }

    @Override
    protected JpaSpecificationExecutor<Principal> getSpecificationExecutor() {
        return dao;
    }

}
