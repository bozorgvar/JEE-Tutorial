/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inheritance.beans;

import com.mycompany.inheritance.entities.InHouseVet;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ammar Bozorgvar at
 * http://stackoverflow.com/users/382154/ammar-bozorgvar
 */
@Singleton
@LocalBean
@Startup
public class MyTest {

    @PersistenceContext(name = "com.mycompany_Inheritance_ejb_1.0-SNAPSHOTPU")
    EntityManager em;

    @PostConstruct
    public void myMain() {
        InHouseVet vet = new InHouseVet();
        vet.setName("Adi2");
        vet.setSalary(8000);        
        vet.setQualification("bvsc");        
        em.persist(vet);
    }
}
