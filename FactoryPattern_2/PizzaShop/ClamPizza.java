/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern_2.PizzaShop;

/**
 *
 * @author checos
 */
public class ClamPizza implements Pizza {
    
    public void prepare(){
        System.out.println("i ma preparing clam piza");
    }
    public void bake(){
        System.out.println("i am baking clam piza");
    }
    public void cut(){
        System.out.println("i ma cutting clam piza");
    }
    public void box(){
        System.out.println("i ma boxing clam piza");
    }
    
}
