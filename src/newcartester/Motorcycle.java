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
public class Motorcycle extends Vehicle{
    public Motorcycle(){
}
    /**
    * returns distance that the Motorcycle can travel based on fuel entered (max distance that can be traveled with inputted amount of fuel)
    */
    public double getDistance(double fuel){
        double distance = fuel * 15.873015873;
        return distance;
}
}
