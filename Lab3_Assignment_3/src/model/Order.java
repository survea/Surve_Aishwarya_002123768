/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author dhairyasheel
 */
public class Order {

    ArrayList<OrderItem> orderItemList;
    public Order() {
        orderItemList = new ArrayList<>();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
    public void addNewOrderItem(Product product, double price,int quantity ){
        OrderItem orderItem = new OrderItem(product, price, quantity);
        orderItemList.add(orderItem);
    }
    
    public OrderItem findProduct(Product product){
        for(OrderItem oi : this.getOrderItemList()){
            if(oi.getProduct().equals(product)){
                return oi;
            }
        }
        return null;
    }

    public void deleteItem(OrderItem item){
        this.orderItemList.remove(item);
    }
}
