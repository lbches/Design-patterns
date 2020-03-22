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
public class RemoteTest {
    public static void main(String[] args) {
        GarageDoor door=new GarageDoor();
        RemoteControl remote=new RemoteControl();
        GarrageDoorOpenCommand openCommand=new GarrageDoorOpenCommand(door);
        remote.setCommand(openCommand);
        remote.buttonWasCliced();
        
    }
}
