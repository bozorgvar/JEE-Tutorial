/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sessionbean.bean;

import javax.ejb.Local;

/**
 *
 * @author Ammar Bozorgvar at
 * http://stackoverflow.com/users/382154/ammar-bozorgvar
 */
@Local
public interface MyStatefullBeanLocal {
    void setAnimalType(String type);
    void setAnimalTotalNo(int totalNo);
    void finish();
    void endTheBean();
}
