package org.acm.sjdavies.dva.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author Stephen Davies
 * @since October 2017
 */
@Entity
public class Claim {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "person_id")
    @JsonBackReference
    private Person claimant;

    private String description;

    private BigDecimal amount;

    public Claim() {}
    
    public Claim(Long id, Person claimant) {
        this.id = id;
        this.claimant = claimant;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Person getClaimant() {
        return claimant;
    }

    public String getDescription() {
        return description;
    }

    public Long getId() {
        return id;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setClaimant(Person claimant) {
        this.claimant = claimant;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Debug aid.
     */
    @Override
    public String toString() {
        StringBuilder buff = new StringBuilder("Claim(");
        buff.append(id);
        buff.append(",");
        buff.append(description);
        buff.append(",");
        buff.append(amount);
        buff.append(")");

        return buff.toString();
    }
}
