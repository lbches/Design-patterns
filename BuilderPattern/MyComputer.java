/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *
 * @author checos
 */
public class MyComputer {
    public static void main(String[] args) {
		//Using builder to get the object in a single line of code and 
                //without any inconsistent state or arguments management issues		
		Computer comp1 = new Computer.ComputerBuilder(
				"500 GB", "2 GB").setBluetoothEnabled(false)
				.setGraphicsCardEnabled(true).build();
                Computer comp2 = new Computer.ComputerBuilder(
				"500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
                System.out.println(comp1.toString());
                System.out.println(comp2.toString());
	}


}
