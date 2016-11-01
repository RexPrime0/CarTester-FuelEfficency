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
 /**
    * Asks for name of gadget
    */
public Car(){
    gadget = JOptionPane.showInputDialog("What kind of gadget do you have in your car?");
}
/**
    * Prints message saying that user has used the gadget
    */
public void UseGadget(){
    JOptionPane.showMessageDialog(null, "You used your " + gadget + "!\n Cool!");
}
/**
    * returns distance that the Car can travel based on fuel entered (max distance that can be traveled with inputted amount of fuel)
    */
public double getDistance(double fuel){
    double distance = fuel * 10.6382978723;
    return distance;
}
}

