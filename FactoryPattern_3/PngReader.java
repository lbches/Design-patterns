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
public class PngReader implements ImageReader {
    DecodedImage decodedImage;
    
    public PngReader(String image){
        this.decodedImage=new DecodedImage(image);
        
    }
    public DecodedImage getDecodeImage(){
        return decodedImage;
    }
    
}
