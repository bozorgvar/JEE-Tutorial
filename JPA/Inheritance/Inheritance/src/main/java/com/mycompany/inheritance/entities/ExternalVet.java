/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inheritance.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
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
public class ExternalVet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "vet_id")
    private Integer vetId;
    @Size(max = 33)
    @Column(name = "external_vetcol")
    private String externalVetcol;
    @Column(name = "visiting_fees")
    private Integer visitingFees;
    @JoinColumn(name = "vet_id", referencedColumnName = "vet_id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Vet vet;

    public ExternalVet() {
    }

    public ExternalVet(Integer vetId) {
        this.vetId = vetId;
    }

    public Integer getVetId() {
        return vetId;
    }

    public void setVetId(Integer vetId) {
        this.vetId = vetId;
    }

    public String getExternalVetcol() {
        return externalVetcol;
    }

    public void setExternalVetcol(String externalVetcol) {
        this.externalVetcol = externalVetcol;
    }

    public Integer getVisitingFees() {
        return visitingFees;
    }

    public void setVisitingFees(Integer visitingFees) {
        this.visitingFees = visitingFees;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vetId != null ? vetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExternalVet)) {
            return false;
        }
        ExternalVet other = (ExternalVet) object;
        if ((this.vetId == null && other.vetId != null) || (this.vetId != null && !this.vetId.equals(other.vetId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.inheritance.entities.ExternalVet[ vetId=" + vetId + " ]";
    }
    
}
