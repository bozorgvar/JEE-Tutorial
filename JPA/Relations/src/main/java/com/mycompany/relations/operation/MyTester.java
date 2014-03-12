/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relations.operation;

import com.mycompany.relations.entities.Animal;
import com.mycompany.relations.entities.Cage;
import com.mycompany.relations.entities.Category;
import com.mycompany.relations.entities.FoodItem;
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

    @PersistenceContext(name = "com.mycompany_Relations_ejb_1.0-SNAPSHOTPU")
    EntityManager em;

    @PostConstruct
    public void myMain() {
        Animal cat = new Animal();
        cat.setType("cat");
        cat.setTotalNo(10);
        
        FoodItem meat = new FoodItem();
        meat.setName("meat");
        FoodItem chicken = new FoodItem();
        chicken.setName("chicken");
        
        cat.getFoodItemList().add(meat);
        meat.getAnimalList().add(cat);
        cat.getFoodItemList().add(chicken);
        chicken.getAnimalList().add(cat);
        
        em.persist(cat);
        em.persist(meat);
        em.persist(chicken);
        
//        Animal animal = new Animal();
//        animal.setType("Frog");
//        animal.setTotalNo(5);
//        Category category = new Category();
//        category.setCategoryType("amphibian");
//        animal.setCategoryId(category);
//        category.getAnimalList().add(animal);
//        em.persist(animal);
//        em.persist(category);
        
       
//        Animal animal = new Animal();
//        animal.setType("dog");
//        animal.setTotalNo(2);
//        Category category = em.find(Category.class, 1);
//        animal.setCategoryId(category);
//        category.getAnimalList().add(animal);
//        em.persist(animal);
        
//        Animal animal = new Animal();
//        animal.setType("Tiger");
//        animal.setTotalNo(3);  
//        Cage cage = new Cage();
//        cage.setCageNo("D3");
//        cage.setLocation("Down South");
//        cage.setAnimal(animal);
//        animal.setCage(cage);
//        System.err.println(cage.getCageNo().toString());
//        System.err.println(animal.getType().toString());
//        em.persist(cage);
//        em.persist(animal);
    }
}
