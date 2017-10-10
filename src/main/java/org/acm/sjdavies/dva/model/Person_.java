package org.acm.sjdavies.dva.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-10-10T12:40:22.435+1100")
@StaticMetamodel(Person.class)
public class Person_ {
	public static volatile SingularAttribute<Person, Long> id;
	public static volatile SingularAttribute<Person, String> name;
	public static volatile SingularAttribute<Person, String> phone;
	public static volatile CollectionAttribute<Person, Claim> claims;
	public static volatile SingularAttribute<Person, String> email;
}
