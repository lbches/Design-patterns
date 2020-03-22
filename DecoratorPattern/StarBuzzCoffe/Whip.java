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
public class Whip extends CodimentDicorator {
    Bevarege beverege;
    private double whipPrice=0.80;
    
    public Whip(Bevarege beverage){
        this.beverege=beverage;
    }
    public String getDiscription(){
        return beverege.getDiscription()+" whip";
    }
    public double cost(){
        return beverege.cost()+whipPrice;
    }
}
