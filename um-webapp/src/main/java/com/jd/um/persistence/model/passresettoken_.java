package com.jd.um.persistence.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2016-03-22T14:07:44.391-0430")
@StaticMetamodel(passresettoken.class)
public class passresettoken_ {
	public static volatile SingularAttribute<passresettoken, Integer> id;
	public static volatile SingularAttribute<passresettoken, String> token;
	public static volatile SingularAttribute<passresettoken, users> user;
	public static volatile SingularAttribute<passresettoken, Date> expirydate;
}
