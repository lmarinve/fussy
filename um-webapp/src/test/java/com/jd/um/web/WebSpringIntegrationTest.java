package com.jd.um.web;

import com.jd.client.spring.CommonClientConfig;
import com.jd.um.spring.UmClientConfig;
import com.jd.um.spring.UmContextConfig;
import com.jd.um.spring.UmPersistenceJpaConfig;
import com.jd.um.spring.UmServiceConfig;
import com.jd.um.spring.UmWebConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CommonClientConfig.class, UmPersistenceJpaConfig.class, UmContextConfig.class, UmServiceConfig.class, UmClientConfig.class, UmWebConfig.class })
@WebAppConfiguration
public class WebSpringIntegrationTest {

    @Test
    public final void whenContextIsBootstrapped_thenOk() {
        //
    }

}
