package com.jd.test.common.client.template;

import com.jd.client.marshall.IMarshaller;
import com.jd.client.template.IRestClientWithUri;
import com.jd.common.interfaces.IDto;
import com.jd.common.interfaces.IOperations;

import com.jayway.restassured.specification.RequestSpecification;

public interface IRestClient<T extends IDto> extends IOperations<T>, IRestClientAsResponse<T>, IRestClientWithUri<T> {

    // template

    RequestSpecification givenReadAuthenticated();

    RequestSpecification givenDeleteAuthenticated();

    IMarshaller getMarshaller();

    String getUri();

}
