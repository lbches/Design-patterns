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
//command open implementation
public class GarrageDoorOpenCommand implements Command {
    GarageDoor door;
    public GarrageDoorOpenCommand(GarageDoor door){
        this.door=door;
    }
    
    public void execute(){
        door.up();
    }
    
}
