/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommmandPatterns.HomeRemoteAutomationControl.GarageDoor;

/**
 *
 * @author checos
 */

//this class is the invoker classs
public class RemoteControl {
    Command slot;
    public RemoteControl(){}
    public void setCommand(Command command){
        this.slot=command;
    }
    public void buttonWasCliced(){
        slot.execute();
    }
    
}
