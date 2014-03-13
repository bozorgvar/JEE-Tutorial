/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.select.entities;

/**
 *
 * @author Ammar Bozorgvar at
 * http://stackoverflow.com/users/382154/ammar-bozorgvar
 */
public class AnimalInfo {
    private String type;
    private Integer totalNo;

    public AnimalInfo(String type, Integer totalNo) {
        this.type = type;
        this.totalNo = totalNo;
    }

    public Integer getTotalNo() {
        return totalNo;
    }

    public void setTotalNo(Integer totalNo) {
        this.totalNo = totalNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}