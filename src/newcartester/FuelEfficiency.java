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
public class FuelEfficiency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        *Declare the vehicle 
        */
        Vehicle vehicle1;
        /*
        *ask about type of car
        */
        String choice = JOptionPane.showInputDialog(
             "What type of vehicle do you want?:\n"
            + "1 - Truck\n"
            + "2 - Car\n"
            + "3 - Hybrid Car\n"
            + "4 - Motorcycle\n");
        /*
        *Different choices for vehicle subclass, leads into different fuel : distance ratios
        1 - Truck
        2 - Car
        4 - Hybrid Car
        4 - Motorcycle
        */
         if(choice.equals("1")){
             vehicle1 = new Truck();
             String fuelS = JOptionPane.showInputDialog("How much fuel do you want to use?");
             double fuel = Double.parseDouble(fuelS);
             double distance = vehicle1.getDistance(fuel);
             JOptionPane.showMessageDialog(null, "With that amount of fuel you will be able to travel " + distance + "kms");
         } else
             if(choice.equals("2")){
             vehicle1 = new Car();
             String fuelS = JOptionPane.showInputDialog("How much fuel do you want to use?");
             double fuel = Double.parseDouble(fuelS);
             double distance = vehicle1.getDistance(fuel);
             JOptionPane.showMessageDialog(null, "With that amount of fuel you will be able to travel " + distance + "kms");
         } else
             if(choice.equals("3")){
             vehicle1 = new HybridCar();
             String fuelS = JOptionPane.showInputDialog("How much fuel do you want to use?");
             double fuel = Double.parseDouble(fuelS);
             double distance = vehicle1.getDistance(fuel);
             JOptionPane.showMessageDialog(null, "With that amount of fuel you will be able to travel " + distance + "kms");
         } else
             if(choice.equals("4")){
              vehicle1 = new Motorcycle();
              String fuelS = JOptionPane.showInputDialog("How much fuel do you want to use?");
              double fuel = Double.parseDouble(fuelS);
              double distance = vehicle1.getDistance(fuel);
              JOptionPane.showMessageDialog(null, "With that amount of fuel you will be able to travel " + distance + "kms");
         }
        
    }
    
}
