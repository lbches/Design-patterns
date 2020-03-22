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
public class DarkRoast extends Bevarege{
    public DarkRoast(){
        discription="DarkRoast ";
    }
    public double cost(){
        return 2.50;
    }
    
}
