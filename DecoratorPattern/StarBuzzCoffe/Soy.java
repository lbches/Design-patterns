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
public class Soy extends CodimentDicorator{
    Bevarege beverege;
    private double soyPrice=0.30;
    
    public Soy(Bevarege beverage){
        this.beverege=beverage;
    }
    public String getDiscription(){
        return beverege.getDiscription()+" soy";
    }
    public double cost(){
        return beverege.cost()+soyPrice;
    }
    
}
