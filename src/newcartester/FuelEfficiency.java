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
        Vehicle vehicle1 = new Vehicle();
        String choice = JOptionPane.showInputDialog(
             "What type of vehicle do you want?:\n"
            + "1 - Truck\n"
            + "2 - Car\n"
            + "3 - Hybrid Car\n"
            + "4 - Motorcycle\n");
        
         if(choice.equals("1")){
             vehicle1 = new Truck();
         } else
             if(choice.equals("2")){
             vehicle1 = new Car();
         } else
             if(choice.equals("3")){
             vehicle1 = new HybridCar();
         } else
             if(choice.equals("4")){
              vehicle1 = new Motorcycle();
         }
         String fuelS = JOptionPane.showInputDialog("How much fuel do you want to use?");
         double fuel = Double.parseDouble(fuelS);
         double distance = vehicle1.getDistance(fuel);
         JOptionPane.showMessageDialog(null, "With that amount of fuel you will be able to travel " + distance + "kms");
        
    }
    
}
