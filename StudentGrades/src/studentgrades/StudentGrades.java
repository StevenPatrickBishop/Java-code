package studentgrades;

import javax.swing.*;

public class StudentGrades {

    //declarations
    static String studentCountString, scoreString, studentName, maxName;
    static int numOfStudents;
    static double score, max;
    static boolean intTest = true, doubleTest = true;
    static String scoreData[][];

    public static void main(String[] args) {

        /*initial output to get number of students in 
        class. Store head count in string form*/
        studentCountString = JOptionPane.showInputDialog("Enter Number of students");

        // call to input validation and conversion method for type int
        numOfStudents = intValAndConvert(studentCountString);

        //construct array to hold student names and grades
        scoreData = new String[numOfStudents][2];

        //call getStudentGrades method to fill scoreData array with user input
        getStudentGrades();

        //output to user the array if filled
        JOptionPane.showMessageDialog(null, "Score data entry complete");

        //call to findTheMax method that calculates the highest grade in class
        findTheMax();

        //output student with highest grade in class
        JOptionPane.showMessageDialog(null,
                String.format("%s's score of %.2f is the highest in the class", maxName, max));
    }

    //Method to test for int type numeric input
    static boolean numTestI(String value) {
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    //Method to test for int type numeric input

    static boolean numTestD(String value) {
        try {
            Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    /*argument = studentCOuntString: validates input for number
    of students in the class and converts the string input 
    into a integer for processing*/
    static int intValAndConvert(String input) {
        intTest = numTestI(input);
        while (!intTest) {
            JOptionPane.showMessageDialog(null, "Invalid entry");
            input = JOptionPane.showInputDialog("Enter Number of students");
            intTest = numTestI(input);
        }
        //convert string value of student head count to int value
        return Integer.parseInt(input);
    }

    /*argument = scoreString: validates input for student score 
    entries and converts the scores from string to double for 
    processing
     */
    static String doubleValidate(String input) {
        doubleTest = numTestD(input);
        while (!doubleTest) {
            JOptionPane.showMessageDialog(null, "Invalid entry");
            input = JOptionPane.showInputDialog("Enter " + studentName + "'s Score");
            doubleTest = numTestD(input);
        }

        //convert string value of score to double value
        return input;
    }

    //method to fill the array with student names and thier score
    static void getStudentGrades() {
        for (int i = 0; i < numOfStudents; i++) {
            //Student data var assignments
            studentName = JOptionPane.showInputDialog("Enter student name");
            scoreString = JOptionPane.showInputDialog("Enter " + studentName + "'s Score");
            scoreData[i][0] = studentName;
            //call doubleValidate method prior to storing score in the array
            scoreData[i][1] = doubleValidate(scoreString);                                          //scoreString;

            JOptionPane.showMessageDialog(null, studentName + "'s score submited");
        }

    }

    static void findTheMax() {

        max = Double.parseDouble(scoreData[0][1]);
        maxName = scoreData[0][0];

        for (int i = 1; i < scoreData.length; i++) {
            if (Double.parseDouble(scoreData[i][1]) > max) {
                max = Double.parseDouble(scoreData[i][1]);
                maxName = scoreData[i][0];
            }

        }

    }
}
