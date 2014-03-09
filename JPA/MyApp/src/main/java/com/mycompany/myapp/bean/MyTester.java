/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.bean;

import com.mycompany.myapp.entities.Gender;
import com.mycompany.myapp.entities.Staff;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sun.misc.IOUtils;

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

        Staff staff = new Staff();
        staff.setName("date staff");
        staff.setGender(Gender.F);
        staff.setAge(33);
        staff.setSallary(5000);
        staff.setStart_Date(Calendar.getInstance().getTime());
        em.persist(staff);
        
//        FileInputStream fis;
//        try {
//            fis = new FileInputStream("/home/ammar/james.jpg");
//            byte[] bytes = IOUtils.toByteArray(fis);
//            staff.setPic(bytes);
//        } catch (FileNotFoundException ex) {
////            Logger.getLogger(MyTester.class.getName(), log(Level.SEVERE, null, ex));
//        } catch (IOException ex) {
////            Logger.getLogger(MyTester.class.getName(), log(Level.SEVERE, null, ex));
//        }

//        Staff staff = em.find(Staff.class, 1);
//        em.remove(staff);
    }

}
