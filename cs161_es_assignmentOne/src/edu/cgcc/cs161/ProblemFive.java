package edu.cgcc.cs161;

//HEADER
//Program Name: Week 1 Assignment
//Author: Ethan Sexton
//Class: CS161 Winter 2021
//Date: 1/10/2021
//Description: This problem involves using and implementing the logic of instance variables. 

public class ProblemFive {
	/*PSEUDOCODE
	 *  Program Start
	 *  Enter accessory MyString() 
	 * 	 Store "Hello "
	 * 	 Same line Store "World"
	 * 	 Same line Store "!"
	 * Enter main method
	 *  Initialize variable helloWorld to equal a new object
 	 *  Call MyString method with variable
     */

	public static void main(String[] args) {
		ProblemFive helloWorld = new ProblemFive();
		helloWorld.MyString();
		//System.out.println (MyString); 
		//MyString();
	}
	public void MyString()	{
		System.out.print ("Hello ");
		System.out.print ("World");
		System.out.println ("!");
		//System.out.println (new ProblemFive());
		//helloWorld = ("Hello World!");
		 
}
	}
/*FOOTER
* Hello World!
*/