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
public class LoanFactory extends AbstractFactory{
    public Bank getbank(String bank){
        return null;
    }
    public Loan getLoan(String loan){
        if(loan==null){
            return null;
        }
        if(loan.equalsIgnoreCase("home")){
            return new HomeLoan();
        }
        if(loan.equalsIgnoreCase("commercial")){
            return new CommericialLoan();
        }
        if(loan.equalsIgnoreCase("education")){
            return new EducationalLoan();
        }
        return null;
    }
    
}
