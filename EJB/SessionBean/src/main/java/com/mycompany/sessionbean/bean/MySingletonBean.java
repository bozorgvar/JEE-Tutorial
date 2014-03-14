/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sessionbean.bean;

import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

/**
 *
 * @author Ammar Bozorgvar at
 * http://stackoverflow.com/users/382154/ammar-bozorgvar
 */
@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class MySingletonBean implements MySingletonBeanLocal {

    int number;
    @Override
    @Lock(LockType.WRITE)
    public void increment() {
        number++;
    }

    @Override
    @Lock(LockType.READ)
    public int getNumber() {
        return number;
    }
    
}
