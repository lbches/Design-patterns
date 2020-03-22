/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern_3;

/**
 *
 * @author checos
 */
public class DecodedImage {
    private String image;
    
    public DecodedImage(String image){
        this.image=image;
    }
    
    public String toStrings(){
        return image+" is decoded ";
    }
    
}
