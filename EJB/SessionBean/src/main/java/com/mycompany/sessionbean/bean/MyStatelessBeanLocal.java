/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sessionbean.bean;

import com.mycompany.sessionbean.entities.Animal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Ammar Bozorgvar at
 * http://stackoverflow.com/users/382154/ammar-bozorgvar
 */
@Local
public interface MyStatelessBeanLocal {
    String sayHello(String name);
    List<Animal> getAllAnimals();

    void init();
}
