package edu.cgcc.cs161;

//HEADER
//Program Name: Week 1 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 1/10/2021
//Description: This problem involves using and implementing the logic of instance variables and static variables.

public class ProblemSix {
	/*PSEUDOCODE
	 * Declare variable a and b
	 * Initialize variable a and b = 20 and 1.5 in calculator()
	 * Call contents from Calculator()
	 * Call contents from calculate() with instance variable
	 * Print out the product of a and b
	 */
	static int a;
	static double b;

	public static void main(String[] args) {
		
		Calculator();
		
	}
	public static void Calculator()	{
		
		a = 20;
		b = 1.5;
		ProblemSix myObject = new ProblemSix();
		myObject.calculate();
	}

	public void calculate() {
		System.out.println (a * b); 
		}
	}

/*FOOTER
 * 30.0
 */
	