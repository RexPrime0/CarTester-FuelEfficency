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
public abstract class Vehicle {
    static int speed;
    static String name;
public Vehicle(){
    name = JOptionPane.showInputDialog("What do you want to name your car?");
    String speeds = JOptionPane.showInputDialog("How fast do you want to start driving (in km/m)"); 
    speed = Integer.parseInt(speeds);
}

public void setSpeed(){
    String speeds = JOptionPane.showInputDialog("How fast do you want your car to be (in km/m)"); 
    speed = Integer.parseInt(speeds);
}

public void park(){
   speed = 0;
   JOptionPane.showMessageDialog(null, "You have now parked! Kewl!\nYour speed is now zero");
}
public double getDistance(double fuel){
    double distance = fuel*100;
    return distance;
}
   
}

