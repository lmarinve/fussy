package com.jd.um.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

// @Configuration
@ComponentScan("com.jd.um.security")
@ImportResource({ "classpath*:umSecurityConfig.xml" })
public class UmSecurityConfig {

    public UmSecurityConfig() {
        super();
    }

}
