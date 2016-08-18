package com.jd.um.spring;

import com.jd.client.spring.CommonClientConfig;
import com.jd.common.spring.CommonWebConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({ "org.baeldung.test.common" })
@Import({ CommonClientConfig.class, CommonWebConfig.class })
public class CommonTestConfig {

    public CommonTestConfig() {
        super();
    }

}
