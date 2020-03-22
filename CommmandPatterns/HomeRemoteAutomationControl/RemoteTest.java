/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommmandPatterns.HomeRemoteAutomationControl;

/**
 *
 * @author checos
 */

//this class is a client in command paattern skima
public class RemoteTest {
    public static void main(String[] args) {
        ///the invoker can be used to passed the command 
        RemoteControl remote=new RemoteControl();
        //light is a receiver class in command pattern langa
        Light light=new Light();
        //now create a command and pass the receiver to ir
        LightOnCommand onCommand=new LightOnCommand(light);
        LightOffCommand offCommand=new LightOffCommand(light);
        //then pass the command to the invoker
        remote.setCommand(onCommand);
        //test for onning
        remote.buttonWasClicked();
        remote.setCommand(offCommand);
        //test for offing
        remote.buttonWasClicked();
        
        
        //remote.buttonWasClicked();
        
        
        
        
        
        
    }
    
}
