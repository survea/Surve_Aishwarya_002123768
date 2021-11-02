/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.patient;

import model.person.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dhairyasheel
 */
public class PatientDirectory {
    
    private List<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList<>(); 
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> personList) {
        this.patientList = personList;
    }
    
     public Patient addPatient() {
        Patient p = new Patient();
        patientList.add(p);
        return p;
    }

    public void removePatient(Patient s) {
        patientList.remove(s);
    }
    public Patient searchProduct(int id) {

        for(Patient p : patientList) {
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}