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
public class FactoryCreator {
    public static AbstractFactory getFactory(String choice){
        if(choice==null){
            return null;
        }
        if(choice.equalsIgnoreCase("bank")){
            return new BankFactory();
        }
        if(choice.equalsIgnoreCase("loan")){
            return new LoanFactory();
        }
        return null;
    }
    
}
