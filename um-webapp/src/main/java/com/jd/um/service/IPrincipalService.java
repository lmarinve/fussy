package com.jd.um.service;

import com.jd.common.persistence.service.IEService;
import com.jd.um.persistence.model.Principal;

public interface IPrincipalService extends IEService<Principal> {

    Principal getCurrentPrincipal();

}
