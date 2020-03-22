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
public class HouseBlend extends Bevarege {
    
    public HouseBlend(){
        discription="House blend";
    }
    public double cost(){
        return 3.50;
    }
    
}
