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
public class StarBuzzCoffe {
    public static void main(String[] args) {
        Bevarege bev=new Espresso();
        System.out.println("This is "+bev.getDiscription()+" and its cost is  "+bev.cost());
        
        Bevarege bev2=new DarkRoast();
        bev2=new Mocha(bev2);
        bev2=new Whip(bev2);
        bev2=new Soy(bev2);
        System.out.println("This is  "+bev2.getDiscription()+" and the overall cost is "+bev2.cost());
        
    }
    
}
