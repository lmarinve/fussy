package com.jd.um.run;

import com.jd.um.spring.UmContextConfig;
import com.jd.um.spring.UmPersistenceJpaConfig;
import com.jd.um.spring.UmServiceConfig;
import com.jd.um.spring.UmServletConfig;
import com.jd.um.spring.UmWebConfig;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude = { // @formatter:off
        ErrorMvcAutoConfiguration.class
})// @formatter:on
@Import({ // @formatter:off
	UmServletConfig.class,
    UmContextConfig.class,
    UmPersistenceJpaConfig.class,
    UmServiceConfig.class,
    UmWebConfig.class
}) // @formatter:on
public class UmApp extends SpringBootServletInitializer {

	//
    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {        
    	return application.sources(UmApp.class);    }

    public static void main(final String... args) {
    	new SpringApplicationBuilder(UmApp.class).listeners().run(args);    }
    }



