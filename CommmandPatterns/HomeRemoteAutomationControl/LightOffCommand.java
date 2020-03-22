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
//commands in command pattern
public class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light){
        this.light=light;    }
    public void execute(){
        light.off();
    }
}
