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
public class ImageReaderFactory {
    
    public ImageReader getImageReader(String image){
        if (image.equalsIgnoreCase("gif")){
            return new GifReader(image);
        }
        if (image.equalsIgnoreCase("jpeg")){
            return new JPEGReader(image);
        }
        if (image.equalsIgnoreCase("png")){
            return new PngReader(image);
        }
        return null;
    }
    
}
