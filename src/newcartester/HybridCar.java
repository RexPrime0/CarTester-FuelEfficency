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
    public HybridCar(){
        name = JOptionPane.showInputDialog("What do you want to name your car?");
        String speeds = JOptionPane.showInputDialog("How fast do you want to start driving (in km/m)"); 
        speed = Integer.parseInt(speeds);
}
    
    public double getDistance(double fuel){
        double distance = fuel * 26.3157894737;
        return distance;
}
}
