/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimUDuck_App.ducks;

/**
 *
 * @author checos
 */
public class MallardDuck extends SimUDuck_App.Duck{
    
    public MallardDuck(){
        quackBehavior=new SimUDuck_App.Quacks.Quack();
        flyBehavior=new SimUDuck_App.Fly.Fly_with_wings();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public  void  display(){
        System.out.println("I am real Mallard Duck");
    }
    public void performFly() {
        flyBehavior.fly();
    }
    public void swim() {
        System.out.println("all ducks swim");
    }
    
}


    

