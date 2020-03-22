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
public abstract class Bevarege {
    String discription="unknown discription";
    
    public String getDiscription(){
        return discription;
    }
    public abstract double cost();
    
}
