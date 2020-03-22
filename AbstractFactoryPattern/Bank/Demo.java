/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern.Bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author checos
 */
public class Demo {
    public static void main(String[] args)throws IOException {
        BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("entet the name of bank : ");
        String bankName=buff.readLine();
        System.out.println("\n");
        System.out.println("enter the type of Loan : ");
        String loanType=buff.readLine();
        
        AbstractFactory bankFactory=FactoryCreator.getFactory("Bank");
        Bank b=bankFactory.getbank(bankName);
        b.getBankName();
        
        
        AbstractFactory loanFactory=FactoryCreator.getFactory("loan");
        Loan l=loanFactory.getLoan(loanType);
        l.calculateLoanPayment(1000, 10);
        
        
    }
   
}
