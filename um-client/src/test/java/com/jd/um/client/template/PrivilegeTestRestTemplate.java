package com.jd.um.client.template;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import com.jd.test.common.client.template.AbstractRestClient;
import com.jd.um.client.UmPaths;
import com.jd.um.persistence.model.Privilege;
import com.jd.um.util.Um;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("client")
public final class PrivilegeTestRestTemplate extends AbstractRestClient<Privilege> {

    @Autowired
    protected UmPaths paths;

    public PrivilegeTestRestTemplate() {
        super(Privilege.class);
    }

    // template method

    @Override
    public final String getUri() {
        return paths.getPrivilegeUri();
    }

    @Override
    public final Pair<String, String> getDefaultCredentials() {
        return new ImmutablePair<String, String>(Um.ADMIN_EMAIL, Um.ADMIN_PASS);
    }

}
