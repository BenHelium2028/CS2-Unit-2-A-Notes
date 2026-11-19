import java.math.*;
public class Main {

   public static void main(String []args) {
      int yourAge = 15;
      int drivingAge = 17;
      // 1. Will these print true or false?
      System.out.println(yourAge == drivingAge);
      // outputs false
      System.out.println(yourAge != drivingAge);
      // outputs true
      // 2. Set yourAge to a new value of 17
      // 3. Print whether yourAge equals drivingAge






      // 2.3 notes if statements
      boolean hasSprinkles = true;
      int sprinkleNum;

      if (hasSprinkles) {
         sprinkleNum = (int)((Math.random()*100)+1);
      }
      else {
         sprinkleNum = 0;
      }

      if (sprinkleNum <= 20) {
         System.out.println("one donut please");
      }
      else if (sprinkleNum == 0){
         System.out.println("a dozen donuts please");
      }
      else {
         System.out.println("no donuts at all");
      }

      // 2.4 notes
      int batteryPrecent = 90;
      if (batteryPrecent > 95) {
         System.out.println("Unplug your phone");
      } 
      else if (batteryPrecent < 50) {
         System.out.println("Plug in your phone");
      }
      else if (batteryPrecent < 20) {
         System.out.println("Low power mode is on");
      }
      else {
         System.out.println("Everything looks good");
      }

   }
}
