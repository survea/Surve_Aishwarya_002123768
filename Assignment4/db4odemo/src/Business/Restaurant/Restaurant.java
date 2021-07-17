/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String restaurantName;
    private UserAccount Manager;

    public Restaurant(String restaurantName, UserAccount Manager) {
        this.restaurantName = restaurantName;
        this.Manager = Manager;
    }

    public Restaurant() {
    }

  

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public UserAccount getManager() {
        return Manager;
    }

    public void setManager(UserAccount Manager) {
        this.Manager = Manager;
    }
    
    @Override
    public String toString(){
        return restaurantName;
    }
    
}
