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
public class Vehicle {
    static int speed;
    static String name;
public Vehicle(){
    name = JOptionPane.showInputDialog("What do you want to name your car?");
    String speeds = JOptionPane.showInputDialog("How fast do you want to start driving (in km/m)"); 
    speed = Integer.parseInt(speeds);
}
    /**
    * Sets the speed of the car
    */
public void setSpeed(){
    String speeds = JOptionPane.showInputDialog("How fast do you want your car to be (in km/m)"); 
    speed = Integer.parseInt(speeds);
}
/**
    * Sets the speed of the car to zero
    */
public void park(){
   speed = 0;
   JOptionPane.showMessageDialog(null, "You have now parked! Kewl!\nYour speed is now zero");
}
/**
    * Calculates the distance the car can travel based on fuel inputted
    */
public double getDistance(double fuel){
    double distance = fuel*100;
    return distance;
}
   
}

