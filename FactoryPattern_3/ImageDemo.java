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
public class ImageDemo {
    public static void main(String[] args) {
        ImageReaderFactory fac=new ImageReaderFactory();
        ImageReader reader=fac.getImageReader("gif");
        DecodedImage image=new DecodedImage("gif");
        image.toStrings();
    }
}
