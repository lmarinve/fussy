package com.jd.um.test.live;

import com.jd.um.spring.UmClientConfig;
import com.jd.um.spring.UmLiveTestConfig;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { UmLiveTestConfig.class, UmClientConfig.class }, loader = AnnotationConfigContextLoader.class)
public abstract class UmGeneralRestLiveTest {
    //
}
