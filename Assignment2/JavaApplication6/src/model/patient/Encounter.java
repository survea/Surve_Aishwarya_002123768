/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.patient;

/**
 *
 * @author dhairyasheel
 */
public class Encounter {
    private String date;
    private String symptoms;
    private String diagosis;
    private VitalSigns vitalSigns;

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagosis() {
        return diagosis;
    }

    public void setDiagosis(String diagosis) {
        this.diagosis = diagosis;
    }

    @Override
    public String toString() {
        return String.valueOf(date);
    }
}
