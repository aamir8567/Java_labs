/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cylinder;

/* 
   Program to calculate the volume of a right circular     
   cylinder.      
   Programmer: Sammy Student, File Name: Cylinder.java 
*/

// package for Scanner class objects
import java.util.Scanner;

public class Cylinder
{
  public static void main(String args[]) {
    // introduce a Scanner class object
    Scanner sc = new Scanner(System.in);

    // declare and initialize the variables
    double height = 0, radius = 0, volume = 0;
    String strName = "";

    // greet the program user	
    System.out.println("Welcome to the Volume Program!");
    // prompt user for their name
    System.out.println("please enter your name");
    // read the user name
    strName = sc.nextLine();
    //display the name back to the user
    System.out.println("hello " + strName);
	     
    // input: assign values to the variables	
    System.out.print("Please enter the radius. ");
    radius = sc.nextDouble(); 
    System.out.print("Please enter the height. ");
    height = sc.nextDouble();
 
    // process: compute the required quantity
    volume = 3.1416 * radius * radius * height;

    // output: display the output to the user
    System.out.print("The volume of the cylinder is: ");
    System.out.print(volume);
    System.out.println(" cubic length units ");
    
    
    // dismiss the Scanner class object
    sc.close();
  }
}
