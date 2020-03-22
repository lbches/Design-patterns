/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimUDuck_App;

/**
 *
 * @author checos
 */
public abstract class Duck {
    
    public SimUDuck_App.QuackBehavior quackBehavior;
    public SimUDuck_App.FlyBehavior flyBehavior;
    public Duck(){}
    
    public void performQuack(){
        quackBehavior.quack();
    }
    
    public abstract void display();
    public void performFly() {
        flyBehavior.fly();
    }
    public void swim() {
        System.out.println("all ducks swim");
    }
   
    
}
    