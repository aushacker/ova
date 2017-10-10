package org.acm.sjdavies.dva.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author Stephen Davies
 * @since October 2017
 */
@Entity
public class Person {

    public Person() {
        this.claims = new ArrayList<>();
    }

    public Person(Long id) {
        this.id = id;
        this.claims = new ArrayList<>();
    }

    @Id()
    private Long id;

    private String email;

    private String name;

    private String phone;

    @OneToMany(mappedBy="claimant")
    @JsonManagedReference
    private Collection<Claim> claims;
    
    public Collection<Claim> getClaims() {
        return claims;
    }

    public String getEmail() {
        return email;
    }

    public boolean getHasClaims() {
        return !claims.isEmpty();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Debug aid.
     */
    @Override
    public String toString() {
        StringBuilder buff = new StringBuilder("Person(");
        buff.append(id);
        buff.append(",");
        buff.append(name);
        buff.append(",");
        buff.append(email);
        buff.append(",");
        buff.append(phone);
        buff.append(")");

        return buff.toString();
    }
}
