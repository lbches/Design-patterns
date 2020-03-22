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
public class BuyStock implements Order{
    Stock abcStock;
    public BuyStock(Stock stock){
        this.abcStock=stock;
    }
    public void execute(){
        abcStock.buy();
    }
    
}
