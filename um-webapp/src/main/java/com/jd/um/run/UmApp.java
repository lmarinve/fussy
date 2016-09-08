package com.jd.um.run;

import com.jd.um.spring.UmContextConfig;
import com.jd.um.spring.UmPersistenceJpaConfig;
import com.jd.um.spring.UmServiceConfig;
import com.jd.um.spring.UmServletConfig;
import com.jd.um.spring.UmWebConfig;

import java.util.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSenderImpl;

//@Configuration
//@ComponentScan(basePackages = { "com.jd.um" })
@PropertySource("classpath:email.properties")
@SpringBootApplication(exclude = { // @formatter:off
        ErrorMvcAutoConfiguration.class})// @formatter:on
public class UmApp extends SpringBootServletInitializer {

    private final static Object[] CONFIGS = { UmContextConfig.class, UmPersistenceJpaConfig.class, UmServiceConfig.class, UmWebConfig.class, UmServletConfig.class };

    //

    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(CONFIGS);
    }

    public static void main(final String... args) {
        SpringApplication.run(CONFIGS, args);
    }

	

    @Autowired
    private Environment env;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public JavaMailSenderImpl javaMailSenderImpl() {
        final JavaMailSenderImpl mailSenderImpl = new JavaMailSenderImpl();
        mailSenderImpl.setHost(env.getProperty("smtp.host"));
        mailSenderImpl.setPort(env.getProperty("smtp.port", Integer.class));
        mailSenderImpl.setProtocol(env.getProperty("smtp.protocol"));
        mailSenderImpl.setUsername(env.getProperty("smtp.username"));
        mailSenderImpl.setPassword(env.getProperty("smtp.password"));
        final Properties javaMailProps = new Properties();
        javaMailProps.put("mail.smtp.auth", true);
        javaMailProps.put("mail.smtp.starttls.enable", true);
        mailSenderImpl.setJavaMailProperties(javaMailProps);
        return mailSenderImpl;
    }

    
    }



