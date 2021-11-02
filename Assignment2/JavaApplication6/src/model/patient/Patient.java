/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.patient;

import java.util.ArrayList;
import java.util.List;
import model.person.Person;

/**
 *
 * @author dhairyasheel
 */
public class Patient extends Person {
    
    private Person person;
     private String highBP;
    public Person getPatient() {
        return person;
    }
    
    public String isHighBP() {
        return highBP;
    }

    public void setHighBP(String highBP) {
        this.highBP = highBP;
    }

    public void setPatient(Person person) {
        this.person = person;
    }

    public List<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(List<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    private List<Encounter> encounterHistory;

    public Patient() {
       encounterHistory = new ArrayList<>();
    }

    public Encounter addEncounter(){
        Encounter e = new Encounter();
        encounterHistory.add(e);
        return e;
    }
    @Override
    public String toString() {
        return String.valueOf(person.getId());
    }

    public void removeEncounter(Encounter encounter) {
        encounterHistory.remove(encounter);
    }
}
