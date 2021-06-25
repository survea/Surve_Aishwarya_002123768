/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.person;

/**
 *
 * @author dhairyasheel
 */
public class Person {
    private int id;
    private String name;
    private String DOB;
    private int age;
    private String gender;
    private House address;
    private City City;
    
      private static int count = 0;
      
    public Person(){
        count++;
        id = count;
    }

    public City getCity() {
        return City;
    }

    public void setCity(City City) {
        this.City = City;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return DOB;
    }

    public void setDate(String date) {
        this.DOB = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public House getAddress() {
        return address;
    }

    public void setAddress(House address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
