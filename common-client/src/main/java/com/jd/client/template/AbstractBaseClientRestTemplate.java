package com.jd.client.template;

import org.apache.commons.lang3.tuple.Pair;
import com.jd.client.marshall.IMarshaller;
import com.jd.client.util.HeaderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;

public abstract class AbstractBaseClientRestTemplate {

    @Autowired
    protected IMarshaller marshaller;

    public AbstractBaseClientRestTemplate() {
        super();
    }

    // find - one

    // util

    // template method

    protected abstract Pair<String, String> getDefaultCredentials();

    protected Pair<String, String> getReadCredentials() {
        return getDefaultCredentials();
    }

    protected Pair<String, String> getReadExtendedCredentials() {
        return getReadCredentials();
    }

    protected Pair<String, String> getWriteCredentials() {
        return getDefaultCredentials();
    }

    /**
     * - this is a hook that executes before read operations, in order to allow custom security work to happen for read operations; similar to: AbstractRestTemplate.findRequest
     */
    protected void beforeReadOperation() {
        //
    }

    // read

    /**
     * - note: hook to be able to customize the find headers if needed
     */
    protected HttpHeaders readHeaders() {
        return HeaderUtil.createAcceptHeaders(marshaller);
    }

}
