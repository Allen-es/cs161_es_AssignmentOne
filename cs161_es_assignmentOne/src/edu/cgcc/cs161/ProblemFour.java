package edu.cgcc.cs161;

//HEADER
//Program Name: Week 1 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 1/10/2021
//Description: This problem involves compiling an output using a static variable. 

public class ProblemFour {
	
	/*PSEUDOCODE
	 * Program start
	 * Declare Static Variable x
	 * Enter main method
	 *  Initialize Variable x = "Hello World!"
	 *  Print out x
	 */
	static String x;

	public static void main(String[] args) {
		x = ("Hello World!");
		System.out.println(ProblemFour.x);
	}
}

/*FOOTER
Hello World!
*/ 