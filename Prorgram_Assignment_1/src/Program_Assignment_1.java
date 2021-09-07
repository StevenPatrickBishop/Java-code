
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


public class Program_Assignment_1 {
    
    //function to test for numeric input
     private static boolean numericTest( String value )
        {
        try
            {
            Double.parseDouble( value );
            }
        catch ( NumberFormatException e )
            {
            return false;
            }
        return true;
        }

  
    public static void main(String[] args) {
        

     //declarations
     char tempSign = 176 ;
     String c = "celsius";
     String f = "fahrenheit";    
     String tempType, confirm, tempString, targetTempType = f;    
     double temperatureNum, convertedTemp;
     boolean numTest;
     
  //create instance of scanner input object   
     Scanner input = new Scanner(System.in);
     
      
//great user, present option to convert from Celsisu or fahrenheit 

System.out.println("Welcome to my temperature conversion program!");
 System.out.println("Are you converting from celsius or fahrenheit?");
 
 
 
 //get temperature type from user, store input in tempType variable

 tempType = input.nextLine(); 

 
 // check that user input is either celsius or fahrenheit
 
while (  !c.equals(tempType) && !f.equals(tempType) ){
 System.out.println( tempType);
    System.out.println("Invalid Entry");
    System.out.println("please type celsius or fahrenheit ");
tempType = input.nextLine();
}




//sets the target temp type for output purposes.(set to fahrenheit by default)
// e.g. if user is converting from fahrenheit, the target temp will be celsius

if ( tempType.equals(f)){
targetTempType = c;
}




// get temperature value to convert from user, store as a string type

System.out.println("Enter "+ tempType + " temperature");
//temperatureNum = input.nextDouble();
tempString = input.next();




/*call numericTest function and test that user entered a string value 
that can be cast to a double*/

numTest = numericTest(tempString);




/*if the user's input cannot be cast to a double continue to ask 
user to enter valid numeric input until it is able to be 
converted to double type.*/
while (!numTest){
System.out.println("Invalid Entry");
System.out.println("Enter "+ tempType + " temperature e.g. 25, 25.5, 25.55");
tempString = input.next();
numTest = numericTest(tempString);
}



//cast the user input from string type to double for processing

temperatureNum =  Double.parseDouble(tempString);


//confirm  that user is happy with entry

System.out.println("Convert " + temperatureNum + tempSign + " " + tempType
        + " to " + targetTempType +"?");
System.out.println("Type yes or no");
confirm = input.next();


//loop to ensure that user's response is either yes or no

while (!"yes".equals(confirm) && !"no".equals(confirm)){
    System.out.println("Invalid Entry");
    System.out.println("yes or no");
    confirm = input.next();
}



/* re-capture input if user's response is no, and they want to enter
a different temperture*/

while ("no".equals(confirm)){

  System.out.println("Enter " + tempType + " temperature");
  tempString = input.next();
  numTest = numericTest(tempString);
  
  //retest for numeric value
  
  
        while (!numTest){
          System.out.println("Invalid Entry");
          System.out.println("Enter "+ tempType + " temperature e.g. 25, 25.5, 25.55");
          tempString = input.next();
          numTest = numericTest(tempString);
          }
    temperatureNum =  Double.parseDouble(tempString);
  
  System.out.println("Convert " + temperatureNum + tempSign + " " + tempType
        + " to " + targetTempType +"?");
  System.out.println("yes or no");
  confirm = input.next();
}

    //Process temperature conversion and output results 
    
    //path if user is converting from celsius to fahrenheit
    if (tempType.equals(c)){
     convertedTemp = (int)((temperatureNum * (9.0/5.0) + 32)*100)/100.0;
     System.out.println(tempString + tempSign + " " + c + " is equal to " 
             + convertedTemp + tempSign + " " + f);
        }
    
   //path if user is converting from fahrenheit to celsius 
   else {
     convertedTemp = (int)((temperatureNum - 32) /(9.0/5.0)*100)/100.0;
     System.out.println(tempString + tempSign + " " + f + " is equal to " 
             + convertedTemp + tempSign + " " + c);
        }
    
    //exit message
    System.out.println("Thank you for trying");

    }
    
}
