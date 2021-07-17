/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.DeliveryMan.DeliveryMan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private List<Customer> customerList = new ArrayList<>();

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
     
    public Customer createCustomer(){
        Customer deliveryMan = new Customer();
        customerList.add(deliveryMan);
        return deliveryMan;
    }
    
    public void removeCustomer(Customer customer) {
        customerList.remove(customer);
    }
}
