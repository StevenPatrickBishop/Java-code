/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author SBISHOP
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   long millTime = System.currentTimeMillis();
   long totalSeconds = millTime/1000;
   long currentSecond = totalSeconds % 60;
   long totalMinutes = totalSeconds/60;
   long currentMinute = totalMinutes % 60;
   long totalHours = totalMinutes/60;
   long currentHour = totalHours%60;
   
   
   
System.out.println("current time is "+ (currentHour)  + ":"+ currentMinute + ":" + currentSecond);

   
      
    }
    
}
