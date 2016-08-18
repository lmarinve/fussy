package com.jd.um.security;

import static com.jd.common.spring.util.Profiles.CLIENT;
import static com.jd.common.spring.util.Profiles.TEST;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.springframework.http.MediaType.APPLICATION_JSON;

import com.jd.test.common.client.security.ITestAuthenticator;
import com.jd.um.client.UmPaths;
import com.jd.um.spring.CommonTestConfig;
import com.jd.um.spring.UmClientConfig;
import com.jd.um.spring.UmLiveTestConfig;
import com.jd.um.util.Um;
import com.jd.um.web.dto.UserDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { UmLiveTestConfig.class, UmClientConfig.class, CommonTestConfig.class }, loader = AnnotationConfigContextLoader.class)
@ActiveProfiles({ CLIENT, TEST })
public class AuthenticationRestLiveTest {

    @Autowired
    private UmPaths paths;

    @Autowired
    private ITestAuthenticator auth;

    // tests

    @Test
    public final void whenAuthenticationIsPerformed_then200IsReceived() {
        // When
        final Response response = givenAuthenticated().contentType(APPLICATION_JSON.toString()).get(paths.getAuthenticationUri());

        // Then
        assertThat(response.getStatusCode(), is(200));
    }

    @Test
    public final void whenAuthenticationIsPerformed_thenResponseHasContent() {
        // When
        final Response response = givenAuthenticated().contentType(APPLICATION_JSON.toString()).post(paths.getAuthenticationUri());

        // Then
        assertThat(response.asString(), is(notNullValue()));
    }

    @Test
    public final void whenAuthenticationIsPerformed_thenResponseIsPrincipal() {
        // When
        final Response response = givenAuthenticated().contentType(APPLICATION_JSON.toString()).get(paths.getAuthenticationUri());

        // Then
        response.as(UserDto.class);
    }

    @Test
    public final void whenAuthenticationIsPerformed_thenPrincipalResponseIsCorrect() {
        // When
        final Response response = givenAuthenticated().contentType(APPLICATION_JSON.toString()).get(paths.getAuthenticationUri());

        // Then
        final UserDto actual = response.as(UserDto.class);
        assertEquals(Um.EMAIL, actual.getEmail());
    }

    // util

    protected RequestSpecification givenAuthenticated() {
        return auth.givenAuthenticated(Um.ADMIN_EMAIL, Um.ADMIN_PASS);
    }

}
