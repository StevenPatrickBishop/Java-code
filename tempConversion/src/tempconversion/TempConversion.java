/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconversion;

import java.util.Scanner;

/**
 *
 * @author SBISHOP
 */

/*
*Program will prompt user for a temperature to convert from,
either celsius or fahrenheit. the program will convert the 
input from celsius to fahrenheit, or from fahrenheit to celsius
depending on the users preference.
*/
public class TempConversion {

  
    public static void main(String[] args) {
        
     //scanner input object   
     Scanner input = new Scanner(System.in);
     
     //declarations
     String c = "celsius";
     String f = "fahrenheit";    
     String tempType, confirm;    
     double temperatureNum, convertedTemp;
     
     
   //great user, present option to convert from Celsisu or fahrenheit 
 System.out.println("Welcome to my temperature conversion program!");
 System.out.println("Are you converting from celsius or fahrenheit?");
 
 
 //get temperature type from user, store input in tempType variable
 tempType = input.nextLine(); 

 // check that user input is an expected input choice.
while (  !c.equals(tempType) && !f.equals(tempType) ){
 System.out.println( tempType);
    System.out.println("please enter celsius or fahrenheit ");
tempType = input.nextLine();
}

// get temperature to convert from user, store in temperatureNum variable
System.out.println("Please enter your " + tempType + " temperature");
temperatureNum = input.nextDouble();


//confirm correct number entry
System.out.println("you typed " + temperatureNum + ", is that correct?");
System.out.println("yes or no");

confirm = input.next();



while (!"yes".equals(confirm) && !"no".equals(confirm)){

    System.out.println("yes or no");
    confirm = input.next();

}

while ("no".equals(confirm)){

  System.out.println("Please enter your " + tempType + " temperature");
  temperatureNum = input.nextDouble();
  System.out.println("you typed " + temperatureNum + ", is that correct?");
  System.out.println("yes or no");
  confirm = input.next();
}


    //Process temperature conversion
   
    
    //path if user is converting from celsius (variable c)
    if (tempType.equals(c)){
     convertedTemp = (int)((temperatureNum * (9.0/5.0) + 32)*100)/100.0;
     System.out.println("your temperature in fahrenheit is " + convertedTemp);
   }
    
   //path if user is converting from fahrenheit (variable f)
   else {
   convertedTemp = (int)((temperatureNum - 32) /(9.0/5.0)*100)/100.0;
     System.out.println("your temperature in celsius is " + convertedTemp);
   
        }

    }
    
}
