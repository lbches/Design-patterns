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
public class SellStock implements Order {
    Stock sellStock;
    public SellStock(Stock seStock){
        this.sellStock=seStock;
    }
    public void execute(){
        sellStock.sell();
    }
    
}
