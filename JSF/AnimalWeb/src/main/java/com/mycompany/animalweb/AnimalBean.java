/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.animalweb;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Ammar Bozorgvar at
 * http://stackoverflow.com/users/382154/ammar-bozorgvar
 */
@ManagedBean//(name = "someBean")
@RequestScoped
public class AnimalBean {

    private String type;
    private int totalNo;
    private String password;
    private String myText;
    private boolean mailMe;
    private int[] selectedPeople;
    private int selectedPerson;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotalNo() {
        return totalNo;
    }

    public void setTotalNo(int totalNo) {
        this.totalNo = totalNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMyText() {
        return myText;
    }

    public void setMyText(String myText) {
        this.myText = myText;
    }

    public boolean isMailMe() {
        return mailMe;
    }

    public void setMailMe(boolean mailMe) {
        this.mailMe = mailMe;
    }

    public int[] getSelectedPeople() {
        return selectedPeople;
    }

    public void setSelectedPeople(int[] selectedPeople) {
        this.selectedPeople = selectedPeople;
    }

    public int getSelectedPerson() {
        return selectedPerson;
    }

    public void setSelectedPerson(int selectedPerson) {
        this.selectedPerson = selectedPerson;
    }

    public List<Person> getPeopleList(){
        List<Person> peopleList = new ArrayList<Person>();
        peopleList.add(new Person(1, "Ammar"));
        peopleList.add(new Person(2, "Reza"));
        peopleList.add(new Person(3, "Ali"));
        peopleList.add(new Person(4, "alex"));
        return peopleList;
    }
    
    public String saveAnimal() {
        System.out.println("this is " + selectedPerson);

        for (int i : selectedPeople) {
            System.out.println("selected people are "+i);
        }

        //        return "show";
        return null;
    }
    
    public String redirecting(){
        try {
            System.out.println("Redirection");
        } catch (Exception e) {
            return "failure";
        }
        return "success";
    }

    public void someMethod(ActionEvent e) {
    }
}
