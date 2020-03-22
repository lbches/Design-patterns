/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingltonPattern;

/**
 *
 * @author checos
 */
public class SingletonPatternDemo {
   public static void main(String[] args) {

      
      SingleObject object = SingleObject.getInstance();

      //show the message
      object.showMessage();
   }
}
