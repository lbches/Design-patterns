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
public class PizzaStore {
    

    public static void main(String[] args) {
         
        PizzaFactory piza=new PizzaFactory();
        Pizza piz=piza.createPizza("cheese");
        piz.prepare();
        piz.bake();
        piz.cut();
        piz.box();
        
        
        
        
    }
    
}
