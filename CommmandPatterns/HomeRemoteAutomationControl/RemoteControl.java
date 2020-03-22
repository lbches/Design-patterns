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


//this class is our invoker class in command pattrn linga
public class RemoteControl {
    //one slot to hold our command 
    Command[] onCommands;
    Command[] offCommands;
    Command slot;
    
    public RemoteControl(){}
    
    //setting the command for controlling the slot
    public void setCommand(Command command){
        this.slot=command;
    }
    public void buttonWasClicked(){
        slot.execute();
    }
    
    
    
}
