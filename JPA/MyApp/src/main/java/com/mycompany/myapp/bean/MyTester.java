/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.bean;

import com.mycompany.myapp.entities.Staff;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ammar bozorgvar
 */
@Singleton
@LocalBean
@Startup
public class MyTester {

    @PersistenceContext(name = "com.mycompany_MyApp_ejb_1.0-SNAPSHOTPU")
    EntityManager em;

    @PostConstruct
    public void myMain() {

//        Staff staff = new Staff();
//        staff.setName("alex");
//        staff.setGender("M");
//        staff.setAge(44);
//        staff.setSallary(6000);
//        em.persist(staff);

        Staff staff = em.find(Staff.class, 1);
        em.remove(staff);
    }
}
