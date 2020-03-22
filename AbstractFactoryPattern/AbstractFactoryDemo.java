/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

/**
 *
 * @author checos
 */
public class AbstractFactoryDemo {
    private static Application configureApplication(){
        Application app;
        GUIFactory factory;
        String osName=System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            factory=new MacosFactory();
            app=new Application(factory);
        }else{
            factory=new Windowsfactory();
            app=new Application(factory);
        }
        return app;
    }
}
