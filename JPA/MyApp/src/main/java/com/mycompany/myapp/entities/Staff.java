/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author ammar
 */
@Entity
public class Staff implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer staffId;
    @Column(name = "AGE")
    private Integer age;
    private String gender;
    private String name;
    @Column(name = "SALLARY")
    private Integer sallary;

    public Staff() {
    }

    public Staff(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSallary() {
        return sallary;
    }

    public void setSallary(Integer sallary) {
        this.sallary = sallary;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (staffId != null ? staffId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Staff)) {
            return false;
        }
        Staff other = (Staff) object;
        if ((this.staffId == null && other.staffId != null) || (this.staffId != null && !this.staffId.equals(other.staffId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.myapp.Staff[ staffId=" + staffId + " ]";
    }
    
}
