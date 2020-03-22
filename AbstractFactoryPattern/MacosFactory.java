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
public class MacosFactory implements GUIFactory {
    public Button createButton(){
        return new WindowsButton();
    }
    public CheckBox createCheckbox(){
        return new WindowsCheckBox();
    }
}
