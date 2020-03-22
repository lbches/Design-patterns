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
public class BankFactory extends AbstractFactory {
    public Bank getbank(String bank){
        if(bank==null){
            return null;
        }
        if(bank.equalsIgnoreCase("commericial")){
            return new CommericialBank();
        }
        if(bank.equalsIgnoreCase("Abay")){
            return new AbayBank();
        }
        if(bank.equalsIgnoreCase("wegagen")){
            return new WegagenBank();
        }
        if(bank.equalsIgnoreCase("abysinia")){
            return new AbysiniaBank();
        }
        return null;
    }
    public Loan getLoan(String loan){
        return null;
    }

    
}
