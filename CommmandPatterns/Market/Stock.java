/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommmandPatterns.Market;

/**
 *
 * @author checos
 */
public class Stock {
    private String name="abc";
    private int quantity=10;
    
    public  void buy(){
        System.out.println("Stock : Name :"+name+" "
                + "and Quantity :"+quantity+"are bought");
    }
    public  void sell(){
        System.out.println("Stock : Name :"+name+" "
                + "and Quantity :"+quantity+"are Sold");
        
    }
    
}
