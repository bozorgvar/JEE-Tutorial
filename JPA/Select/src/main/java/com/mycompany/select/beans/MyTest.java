/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.select.beans;

import com.mycompany.select.entities.Animal;
import com.mycompany.select.entities.AnimalInfo;
import java.util.Calendar;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Ammar Bozorgvar at
 * http://stackoverflow.com/users/382154/ammar-bozorgvar
 */
@Singleton
@LocalBean
@Startup
public class MyTest {

    @PersistenceContext(name = "com.mycompany_Select_ejb_1.0-SNAPSHOTPU")
    EntityManager em;

    @PostConstruct
    public void myMain() {
        //        TypedQuery<Animal> query = em.createQuery("select a from Animal a where a.totalNo > ?1", Animal.class);
        //        query.setParameter(1, 25);
        //        List<Animal> list = query.getResultList();
        //        for(Animal a : list){
        //            System.out.println(a.getType() + " --- " + a.getTotalNo());
        //        }

        //        TypedQuery<Animal> query = em.createQuery("select a from Animal a where a.totalNo > :num", Animal.class);
        //        query.setParameter("num", 25);
        //        List<Animal> list = query.getResultList();
        //        for(Animal a : list){
        //            System.out.println(a.getType() + " --- " + a.getTotalNo());
        //        }

        //        Query query = em.createQuery("select a.type, a.totalNo from Animal a");
        //        List list = query.getResultList();
        //        for (Object obj : list) {
        //            Object[] myArray = (Object[]) obj;
        //            System.out.println(myArray[0] + " --- " + myArray[1]);
        //        }

        //        TypedQuery<Animal> query = em.createNamedQuery("Animal.simple", Animal.class);
        //        List<Animal> list = query.getResultList();
        //        for (Animal obj : list) {
        //            System.out.println(obj.getType() + " --- " + obj.getTotalNo());
        //        }

        /*
         * this is not working
         */
        //        TypedQuery<AnimalInfo> query = em.createQuery("select com.mycompany.select.entities.AnimalInfo( a.type, a.totalNo) from Animal a", AnimalInfo.class);
        //        List<AnimalInfo> list = query.getResultList();
        //        for (AnimalInfo obj : list) {
        //            System.out.println(obj.getType() + " --- " + obj.getTotalNo());
        //        }

        /*
         * pageination
         */
        //        TypedQuery<Animal> query = em.createQuery("select a from Animal a", Animal.class);
        //        query.setFirstResult(2);
        //        query.setMaxResults(3);
        //        List<Animal> list = query.getResultList();
        //        for (Animal a : list) {
        //            System.out.println(a.getType() + " --- " + a.getTotalNo());
        //        }

        /*
         * simple join in JPQL
         */
        //        Query query = em.createQuery("select a.type, a.totalNo from Category c Join c.animalList a");
        //        List list = query.getResultList();
        //        for (Object obj : list) {
        //            Object[] myArray = (Object[]) obj;
        //            System.out.println(myArray[0] + " --- " + myArray[1]);
        //        }

        /*
         * for retrieving simple object we don't need join
         */
        //        Query query = em.createQuery("select a.type, a.category.categoryType from Animal a");
        //        List list = query.getResultList();
        //        for (Object obj : list) {
        //            Object[] myArray = (Object[]) obj;
        //            System.out.println(myArray[0] + " --- " + myArray[1]);
        //        }

        /*
         * for retrieving collection we need join
         */
        //        Query query = em.createQuery("select a.type, f.name from Animal a Join a.foodItems f");
        //        List list = query.getResultList();
        //        for (Object obj : list) {
        //            Object[] myArray = (Object[]) obj;
        //            System.out.println(myArray[0] + " --- " + myArray[1]);
        //        }

        /*
         * left join
         */
        //        Query query = em.createQuery("select a.type, f.name from Animal a LEFT Join a.foodItems f");
        //        List list = query.getResultList();
        //        for (Object obj : list) {
        //            Object[] myArray = (Object[]) obj;
        //            System.out.println(myArray[0] + " --- " + myArray[1]);
        //        }

        /*
         * more than one join
         */
        //        Query query = em.createQuery("select a.type, s.supplierName from Animal a JOIN a.foodItems f JOIN f.supplierId s");
        //        List list = query.getResultList();
        //        for (Object obj : list) {
        //            Object[] myArray = (Object[]) obj;
        //            System.out.println(myArray[0] + " --- " + myArray[1]);
        //        }

        /*
         * BETWEEN expersion
         */
        //        Query query = em.createQuery("select a.type, a.totalNo from Animal a where a.totalNo BETWEEN :lower and :upper");
        //        query.setParameter("lower", 5);
        //        query.setParameter("upper", 15);
        //        List list = query.getResultList();
        //        for (Object obj : list) {
        //            Object[] myArray = (Object[]) obj;
        //            System.out.println(myArray[0] + " --- " + myArray[1]);
        //        }

        /*
         * LIKE expersion
         */
//        TypedQuery<Animal> query = em.createQuery("select a from Animal a where a.type LIKE '%er'", Animal.class);
//        List<Animal> list = query.getResultList();
//        for (Animal animal : list) {
//            System.out.println(animal.getType());
//        }

        /*
         * IN expersion
         */
//        TypedQuery<Animal> query = em.createQuery("select a from Animal a where a.category.categoryType IN ('mamal','bird')", Animal.class);
//        List<Animal> list = query.getResultList();
//        for (Animal animal : list) {
//            System.out.println(animal.getType());
//        }

        /*
         * IS EMPTY expersion
         */
//        TypedQuery<Animal> query = em.createQuery("select a from Animal a where a.foodItems IS EMPTY", Animal.class);
//        List<Animal> list = query.getResultList();
//        for (Animal animal : list) {
//            System.out.println(animal.getType());
//        }

        /*
         * IN expersion
         */
//        TypedQuery<Animal> query = em.createQuery("select a from Animal a where a.category IS NOT NULL", Animal.class);
//        List<Animal> list = query.getResultList();
//        for (Animal animal : list) {
//            System.out.println(animal.getType());
//        }

        /*
         * Aggregate functions
         */
//        Query query = em.createQuery("select SUM(a.totalNo) from Animal a");
//        Object sum = query.getSingleResult();
//        System.out.println("Total number of animals in the zoo is " + sum);
        
        /*
         * GROUP BY
         */
//        Query query = em.createQuery("select c.categoryType, SUM(a.totalNo) from Category c LEFT JOIN c.animalList a GROUP BY c");
//        List list = query.getResultList();
//        for (Object obj : list) {
//            Object[] myArray = (Object[]) obj;
//            System.out.println(myArray[0] + " --- "+ myArray[1]);
//        }
        
        /*
         * HAVING
         */
//        Query query = em.createQuery("select c.categoryType, SUM(a.totalNo) from Category c LEFT JOIN c.animalList a GROUP BY c HAVING SUM(a.totalNo) < 20");
//        List list = query.getResultList();
//        for (Object obj : list) {
//            Object[] myArray = (Object[]) obj;
//            System.out.println(myArray[0] + " --- "+ myArray[1]);
//        }
        
        /*
         * ORDER BY
         */
//        Query query = em.createQuery("select c.categoryType, SUM(a.totalNo) from Category c LEFT JOIN c.animalList a GROUP BY c HAVING SUM(a.totalNo) < 20 ORDER BY SUM(a.totalNo) DESC");
//        List list = query.getResultList();
//        for (Object obj : list) {
//            Object[] myArray = (Object[]) obj;
//            System.out.println(myArray[0] + " --- "+ myArray[1]);
//        }
        
        /*
         * CASE WHEN
         */
        Query query = em.createQuery("select a.type, CASE WHEN a.totalNo<10 THEN 'low' WHEN a.totalNo<20 THEN 'mediom' ELSE 'HIGH' END from Animal a");
        List list = query.getResultList();
        for (Object obj : list) {
            Object[] myArray = (Object[]) obj;
            System.out.println(myArray[0] + " --- "+ myArray[1]);
        }
        
    }
}
