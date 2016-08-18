package com.jd.um.service.main;

import com.jd.common.persistence.model.INameableEntity;
import com.jd.test.common.service.AbstractServiceIntegrationTest;
import com.jd.um.spring.UmClientConfig;
import com.jd.um.spring.UmContextConfig;
import com.jd.um.spring.UmPersistenceJpaConfig;
import com.jd.um.spring.UmServiceConfig;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { UmPersistenceJpaConfig.class, UmServiceConfig.class, UmContextConfig.class, UmClientConfig.class }, loader = AnnotationConfigContextLoader.class)
public abstract class SecServiceIntegrationTest<T extends INameableEntity> extends AbstractServiceIntegrationTest<T> {

    //

}
