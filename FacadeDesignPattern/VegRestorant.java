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
public class VegRestorant implements Hotel{
    public Menus getMenus(){
        return new Menus();
    }
}
