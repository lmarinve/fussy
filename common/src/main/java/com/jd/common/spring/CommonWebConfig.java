package com.jd.common.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.jd.common.web" })
public class CommonWebConfig {

    public CommonWebConfig() {
        super();
    }

}
