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
public class CommericialBank implements Bank{
    private final String  b_name;
    
    public CommericialBank(){
        b_name="commericiao bank of Ethioipa";
    }
    public String getBankName(){
        
        return b_name;
    }
}
