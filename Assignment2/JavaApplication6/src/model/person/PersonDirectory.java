/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.person;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dhairyasheel
 */
public class PersonDirectory {
    
    private List<Person> personList;
    private List<City> city;

    public PersonDirectory() {
        personList = new ArrayList<>(); 
        city = new ArrayList<>(); 
    }

    public List<City> getCity() {
        return city;
    }

    public void setCity(List<City> city) {
        this.city = city;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
    
     public Person addPerson() {
        Person p = new Person();
        personList.add(p);
        return p;
    }

    public void removeSupplier(Person s) {
        personList.remove(s);
    }
    
}
