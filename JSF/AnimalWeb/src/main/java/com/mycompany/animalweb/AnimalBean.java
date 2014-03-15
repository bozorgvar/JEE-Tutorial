/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.animalweb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Ammar Bozorgvar at
 * http://stackoverflow.com/users/382154/ammar-bozorgvar
 */
@ManagedBean//(name = "someBean")
@RequestScoped
public class AnimalBean {
    private String type;
    private int totalNo;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotalNo() {
        return totalNo;
    }

    public void setTotalNo(int totalNo) {
        this.totalNo = totalNo;
    }
    
    public String saveAnimal(){
        System.out.println("saving Animal " + type);
        return "show";
    }
}
