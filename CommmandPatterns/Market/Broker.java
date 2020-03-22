/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommmandPatterns.Market;

import java.util.ArrayList;

/**
 *
 * @author checos
 */
public class Broker {
    private ArrayList<Order> orderList=new ArrayList<Order>();
    
    public void takeOrder(Order order){
        orderList.add(order);
    }
    
    public void placeOrder(){
        System.out.println("The total number of oder id "+orderList.size());
        for(Order order:orderList){
            order.execute();
            
        }
        orderList.clear();
    }
    
}
