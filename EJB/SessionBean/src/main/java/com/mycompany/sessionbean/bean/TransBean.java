 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sessionbean.bean;

import com.mycompany.sessionbean.entities.Animal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

/**
 *
 * @author Ammar Bozorgvar at
 * http://stackoverflow.com/users/382154/ammar-bozorgvar
 */
@Stateless
@LocalBean
//@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionManagement(TransactionManagementType.BEAN)
public class TransBean {

    @Resource
    UserTransaction tx;
    
    @PersistenceContext(name = "com.mycompany_SessionBean_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    public void saveAnimal() {
        try {
            tx.begin();
            Animal animal = new Animal();
            animal.setType("persian cat");
            animal.setTotalNo(5);
            em.persist(animal);
            tx.commit();
        } catch (Exception ex) {
            
        }
    }
}
