/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sessionbean.bean;

import com.mycompany.sessionbean.entities.Animal;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ammar Bozorgvar at
 * http://stackoverflow.com/users/382154/ammar-bozorgvar
 */
@Stateful
public class MyStatefullBean implements MyStatefullBeanLocal {

    @PersistenceContext(name = "com.mycompany_SessionBean_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    String animalType;
    int AnimalTotalNo;

    @Override
    public void setAnimalType(String type) {
        animalType = type;
    }

    @Override
    public void setAnimalTotalNo(int totalNo) {
        AnimalTotalNo = totalNo;
    }

    @Override
    public void finish() {
        Animal animal = new Animal();
        animal.setType(animalType);
        animal.setTotalNo(AnimalTotalNo);
        em.persist(animal);
    }

    @Override
    @Remove
    public void endTheBean() {}
    
    
}
