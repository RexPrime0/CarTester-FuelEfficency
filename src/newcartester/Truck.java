/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newcartester;

import javax.swing.JOptionPane;
import static newcartester.Vehicle.name;

/**
 *
 * @author Abels6598
 */
public class Truck extends Vehicle{
    static double storage;
    public Truck(){
     String storagecap = JOptionPane.showInputDialog("What is the capacity of the Truck's stroage? (in cm3)"); 
     storage = Double.parseDouble(storagecap);
    }
    public void Load(){
        System.out.println("You have loaded our truck with the shipment");
    }
    public void Unload(){
        System.out.println("You have unloaded our truck with the shipment");
    }
    public double getDistance(double fuel){
        double distance = fuel * 7.09219858156;
        return distance;
}
}