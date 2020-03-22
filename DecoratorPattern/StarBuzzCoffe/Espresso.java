/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern.StarBuzzCoffe;

/**
 *
 * @author checos
 */
public class Espresso extends Bevarege {
    
    public Espresso(){
        discription="Espressso";
    }
    public double cost(){
        return 2.50;
    }
    
}
