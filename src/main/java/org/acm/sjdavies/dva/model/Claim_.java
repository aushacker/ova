package org.acm.sjdavies.dva.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-10-07T19:21:55.448+1100")
@StaticMetamodel(Claim.class)
public class Claim_ {
	public static volatile SingularAttribute<Claim, Long> id;
	public static volatile SingularAttribute<Claim, Person> claimant;
	public static volatile SingularAttribute<Claim, String> description;
	public static volatile SingularAttribute<Claim, BigDecimal> amount;
}
