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
public class Community {
    private String community;
    private List<House> houseList;

    public Community() {
        houseList = new ArrayList<>();
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }
    
    public void addHouse(House house) {
        houseList.add(house);
    }
    
}
