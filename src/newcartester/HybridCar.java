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
public class HybridCar extends Vehicle{
    public HybridCar(){}
    
    /**
    * returns distance that the HybridCar can travel based on fuel entered (max distance that can be traveled with inputted amount of fuel)
    */
    public double getDistance(double fuel){
        double distance = fuel * 26.3157894737;
        return distance;
}
}
