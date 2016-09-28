package com.jd.common.interfaces;

public interface IByEmailApi<Z extends IWithEmail> {

    Z findByEmail(final String email);

}
