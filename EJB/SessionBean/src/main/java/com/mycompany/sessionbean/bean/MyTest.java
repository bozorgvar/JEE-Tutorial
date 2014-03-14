/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sessionbean.bean;

import com.mycompany.sessionbean.entities.Animal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Startup;

/**
 *
 * @author Ammar Bozorgvar at
 * http://stackoverflow.com/users/382154/ammar-bozorgvar
 */
@Singleton
@LocalBean
@Startup
public class MyTest {
    
//    @EJB
//    MyStatelessBeanLocal myBean;
//
//    @PostConstruct
//    public void myMain() {
//        System.out.println(myBean.sayHello("Ammar"));
//        List<Animal> list = myBean.getAllAnimals();
//        
//        for (Animal animal : list) {
//            System.out.println(animal.getType() + "---" + animal.getTotalNo());
//        }
//    }
    
//    @EJB
//    MyStatefullBeanLocal myBean;
//    
//    @PostConstruct
//    public void myMain() {
//        myBean.setAnimalType("cheetah");
//        myBean.setAnimalTotalNo(3);
//        myBean.finish();
//        myBean.endTheBean();
//    }
    
    @EJB
    MySingletonBeanLocal myBean;
    
    @PostConstruct
    public void myMain() {
        myBean.increment();
        myBean.increment();
        System.out.println(myBean.getNumber());
        
    }
}
