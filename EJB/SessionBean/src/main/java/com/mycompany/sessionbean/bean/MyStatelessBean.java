/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sessionbean.bean;

import com.mycompany.sessionbean.entities.Animal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Ammar Bozorgvar at
 * http://stackoverflow.com/users/382154/ammar-bozorgvar
 */
@Stateless
public class MyStatelessBean implements MyStatelessBeanLocal {

    @PersistenceContext(name = "com.mycompany_SessionBean_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public List<Animal> getAllAnimals() {
        TypedQuery<Animal> query = em.createQuery("select a from Animal a", Animal.class);
        return query.getResultList();
    }

    @PostConstruct
    public void init() {
        System.out.println("I am initalizing");
    }
    
    @PreDestroy
    public void cleanup() {
        System.out.println("I am cleaning up");
    }
    
    
}
