/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle;

/**
 *
 * @author ASUS
 */
public class Bicycle {

    /**
     * @param args the command line arguments
     */
 int pedalRpm;
 int gear;
 double wheelDiameter;
 int numberOfGears;
 /**
* Constructor for objects of class Bicycle
*
     * @param wheelDiameter
* @oparam wheelDiameter in meters
* @param numberOfGears
*/
 public Bicycle(double wheelDiameter, int numberOfGears)
 {
// initialise instance variables
this.pedalRpm = 300;
this.gear = 1;
this.wheelDiameter = wheelDiameter;
this.numberOfGears = numberOfGears;
 }
 /**
* Constructor for objects of class Bicycle
*/
 public Bicycle()
 {
// initialise instance variables
this.pedalRpm = 300;
this.gear = 1;
this.wheelDiameter = 0.5;
this.numberOfGears = 3;
 } 
    public static void main(String[] args) {
         
    }
    
}
