package com.jd.client.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.jd.common.client", "com.jd.client" })
public class CommonClientConfig {

    public CommonClientConfig() {
        super();
    }

}
