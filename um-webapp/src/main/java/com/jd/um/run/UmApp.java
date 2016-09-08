package com.jd.um.run;

import com.jd.um.persistence.setup.MyApplicationContextInitializer;
import com.jd.um.spring.UmContextConfig;
import com.jd.um.spring.UmJavaSecurityConfig;
import com.jd.um.spring.UmPersistenceJpaConfig;
import com.jd.um.spring.UmServiceConfig;
import com.jd.um.spring.UmServletConfig;
import com.jd.um.spring.UmWebConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude = { // @formatter:off
        SecurityAutoConfiguration.class
        , ErrorMvcAutoConfiguration.class
}) // @formatter:on
@Import({ // @formatter:off
    UmContextConfig.class,

    UmPersistenceJpaConfig.class,

    UmServiceConfig.class,

    UmWebConfig.class,
    UmServletConfig.class,
    UmJavaSecurityConfig.class
}) // @formatter:on
public class UmApp {

    public UmApp() {
        super();
    }

    //

    public static void main(final String... args) {
        new SpringApplicationBuilder(UmApp.class).initializers(new MyApplicationContextInitializer()).run(args);
    }

}
