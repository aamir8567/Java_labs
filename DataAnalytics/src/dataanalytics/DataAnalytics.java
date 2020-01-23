/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataanalytics;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
// Sammy Student: Data Analysis with Java File Processing
class DataAnalytics
{
public static void main(String args[]) throws FileNotFoundException, IOException
{
  // declare an object to receive the data
  Scanner scan = new Scanner(System.in);
  // declare an array list to hold the data
  ArrayList<Integer> list;
 list = new ArrayList<Integer>();
  int count = 0;
  int num = 0;
  int val = 0;
  String line = "";
  int[] READ = new int[100];
  try {
    // create or append to the file 
    FileWriter fileOut = new FileWriter("outData.txt");
    BufferedWriter fout = new BufferedWriter(fileOut);
    
    System.out.println("how many data items?");
    count = scan.nextInt();
    
    for (int i = 1; i <= count; i++) {
      System.out.println("enter a data value");
      val = scan.nextInt();
      fout.write(val + "\n"); 
      //READ[i] = val;
     // list.add(val);
    } // end of for loop
    
    System.out.println("thank you ... the data has been recorded!" + "\n");
    // close the output stream objects
    fout.close();
    fileOut.close();
    scan.close();
  } // end of try 
  
    catch(Exception e){
        // catch an exception if any arises
        System.err.println("Error: " + e.getMessage());
  // pass the path to the file as a parameter 
    }
  
    System.out.println("\n");
  // READING THE FILE
    FileReader fileIn = new FileReader("outData.txt");
    BufferedReader fin = new BufferedReader(fileIn);
    
    while ((line = fin.readLine()) != null) {
        num = Integer.parseInt(line);
    	list.add(num);
    } // end of while loop
    
    
    fin.close();
    fileIn.close();
    
    System.out.println("display unsorted data");
    DisplayData(list);
    
    System.out.println("display sorted data");
    BubbleSort(list); 
    
}//end main

public static void DisplayData(ArrayList<Integer> num){
    for (int i = 0; i < num.size(); i++)
        System.out.println(num.get(i).toString());
} //End of method

public static void BubbleSort(ArrayList<Integer> num){
  int j = 0;
  boolean flag = true;  // set the flag to true to begin first pass
  int temp = 0;  // define the holding variable
    System.out.println(num.get(j+1));
    System.out.println(num.get(j));
  while (flag)
  {
    flag = false; //set flag to false awaiting a possible swap
    for (j = 0; j < num.size() - 1; j++)
    {
      if (num.get(j) > num.get(j+1)) 
      // for descending sort change to <
      {
        temp = num.get(j); //swap the elements
        num.set(j, num.get(j + 1));
        num.set(j + 1, temp);
        
        flag = true; //shows a swap occurred  
      } //end of if statement
    }//end of for statement 
  } // end of while loop
    System.out.println(num.get(j+1));
    System.out.println(num.get(j));
  } // end of method
 

}//end class
