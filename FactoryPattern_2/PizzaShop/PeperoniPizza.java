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
public class PeperoniPizza implements Pizza {
    public void prepare(){
        System.out.println("i ma preparing peperoni piza");
    }
    public void bake(){
        System.out.println("i am baking peperoni piza");
    }
    public void cut(){
        System.out.println("i ma cutting peperoni piza");
    }
    public void box(){
        System.out.println("i ma boxing peperoni piza");
    }
    
}
