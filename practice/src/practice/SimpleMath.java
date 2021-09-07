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

import javax.swing.JOptionPane;
public class SimpleMath {
    
    public static void main(String[] args){
    
    // declare variables
		double integer_one, integer_two;
		String number_one, number_two, sum;

		//get first of two integers
		number_one = JOptionPane.showInputDialog (null, "Please enter first number: ");
		integer_one = Integer.parseInt (number_one);

		number_two = JOptionPane.showInputDialog(null, "Please enter the second number");
		integer_two = Integer.parseInt (number_two);

		JOptionPane.showMessageDialog (null, number_one, "First Number", JOptionPane.OK_CANCEL_OPTION );
		JOptionPane.showMessageDialog (null, number_two, "Second Number", JOptionPane.OK_CANCEL_OPTION );

		JOptionPane.showMessageDialog (null, "Sum equals " + (integer_one + integer_two), "Sum of the numbers", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog (null, "Difference equals " + (integer_one - integer_two), "Difference of two Numbers", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog (null, "Product equals " + (integer_one * integer_two), "Integer Product", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Quotient equals " + (integer_one / integer_two), "Integer Division", JOptionPane.OK_CANCEL_OPTION);

		System.exit(0);
    
    
    }
    
}
