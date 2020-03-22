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
public class Mocha extends CodimentDicorator{
    Bevarege beverege;
    private double mochaprice=0.60;
    
    public Mocha(Bevarege beverage){
        this.beverege=beverage;
    }
    public String getDiscription(){
        return beverege.getDiscription()+" and mocha";
    }
    public double cost(){
        return beverege.cost()+mochaprice;
    }
    
}
