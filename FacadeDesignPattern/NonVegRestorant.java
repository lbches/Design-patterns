/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeDesignPattern;

/**
 *
 * @author checos
 */
public class NonVegRestorant implements Hotel{
    @Override
    public Menus getMenus(){
        return new VegMenu();
    }
}
