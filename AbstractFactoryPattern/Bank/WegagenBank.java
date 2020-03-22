/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern.Bank;

/**
 *
 * @author checos
 */
public class WegagenBank implements Bank{
    private final String  b_name;
    
    public WegagenBank(){
        b_name="Wegagen bank";
    }
    public String getBankName(){
        
        return b_name;
    }
}
