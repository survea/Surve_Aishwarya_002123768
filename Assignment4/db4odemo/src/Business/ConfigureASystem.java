package Business;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.AdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import business.Organization.SystemAdminOrganization;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        system.setCustomerDirectory(new CustomerDirectory());
        system.setRestaurantDirectory(new RestaurantDirectory());
        system.setDeliveryManDirectory(new DeliveryManDirectory());
        
        //Create a network
        
        //create an enterprise
        
        //initialize some organizations
        
        //have some employees 
        
        //create user account
        
        // Sytem Admin
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sys", "sys", employee, new SystemAdminRole());
        
        //Restaurant Management
       Employee restEmp = system.getEmployeeDirectory().createEmployee("manager");
       UserAccount restuser = system.getUserAccountDirectory().createUserAccount("m", "m", restEmp, new AdminRole());
       Restaurant restaurant = system.getRestaurantDirectory().createRestaurant();
       restaurant.setManager(restuser);
       restaurant.setRestaurantName("Indian Taste");
         
        
        return system;
    }
    
}
