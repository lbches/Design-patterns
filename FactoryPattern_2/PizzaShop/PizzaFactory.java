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
public class PizzaFactory {
    
    public Pizza createPizza(String type){
        Pizza piza=null;
        if(type.equalsIgnoreCase("cheese")){
            piza=new CheesePizza();
        }
        else if(type.equalsIgnoreCase("peperoni")){
            piza= new PeperoniPizza();
        }
        else if(type.equalsIgnoreCase("veggie")){
            piza=new VeggiePizza();
        }
        else if(type.equalsIgnoreCase("clam")){
            piza=new ClamPizza();
        }
        return piza;
    }
    
}
