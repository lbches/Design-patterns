/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommmandPatterns.Market;

/**
 *
 * @author checos
 */
public class Demo {
    public static void main(String[] args) {
        int orders=100;
        Stock stk=new Stock();
        BuyStock buyStk=new BuyStock(stk);
        SellStock sellStk=new SellStock(stk);
        Broker broker=new Broker();
        for(int i=0;i<orders;i++){
            broker.takeOrder(buyStk);
            broker.takeOrder(sellStk);
        }
        
        broker.placeOrder();
    }
    
}
