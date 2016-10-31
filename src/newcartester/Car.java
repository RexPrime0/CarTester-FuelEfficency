/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newcartester;

import javax.swing.JOptionPane;

/**
 *
 * @author Abels6598
 */
public class Car extends Vehicle {
 public String gadget;
 
public Car(){
    name = JOptionPane.showInputDialog("What do you want to name your car?");
    String speeds = JOptionPane.showInputDialog("How fast do you want to start driving (in km/m)"); 
    speed = Integer.parseInt(speeds);
    gadget = JOptionPane.showInputDialog("What kind of gadget do you have in your car?");
}
public void UseGadget(){
    JOptionPane.showMessageDialog(null, "You used your " + gadget + "!\n Cool!");
}
public double getDistance(double fuel){
    double distance = fuel * 10.6382978723;
    return distance;
}
}

