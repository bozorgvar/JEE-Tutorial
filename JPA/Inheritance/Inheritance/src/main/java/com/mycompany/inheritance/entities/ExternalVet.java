/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inheritance.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Ammar Bozorgvar at
 * http://stackoverflow.com/users/382154/ammar-bozorgvar
 */
@Entity
@Table(name = "EXTERNAL_VET")
@DiscriminatorValue("EXT_VET")
public class ExternalVet extends Vet{
    private String country;
    @Column(name = "visiting_fees")
    private Integer visitingFees;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getVisitingFees() {
        return visitingFees;
    }

    public void setVisitingFees(Integer visitingFees) {
        this.visitingFees = visitingFees;
    }
}