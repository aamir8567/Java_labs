/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory1;
import java.util.Scanner;
/**
 *
 * @author Aamir
 */
public class Inventory1 {

   static Scanner sc = new Scanner(System.in);
  public static void main(String args[])
  {
   // begin local variable declaration / initialization zone
   char answer = 'Y';

   double average = 0.0, cost = 0.0, totValue = 0.0;
   int number = 0, sumItems = 0, quantity = 0;
   String item = "";
   // end local variable declaration / initialization zone
   
  displayMenu();
   
   while(answer == 'Y' || answer == 'y') 
   {
    // begin code block for inventory evaluation
    System.out.println("number of item types in the inventory ->");
    number = sc.nextInt();
   
    for(int i = 1; i <= number; i++)
    {
     System.out.println("enter the item's description");
     item = sc.next();
     System.out.println("item description: " + item);
     System.out.println("enter item quantity");
     quantity = sc.nextInt();
     sumItems += quantity;
     System.out.println("enter item cost");
     cost = sc.nextDouble();
     totValue += cost * quantity;
    }
    
    AverageCost(totValue , sumItems);
    ComputeTax(totValue , sumItems);
    
   // begin code block to perform additional program run 
   System.out.println("run again(Y or N)?");
   answer = sc.next().charAt(0);
   // end code block to perform additional program run 
  }
   System.out.println("***************************");
  }// end main() method 
  
  static void displayMenu()
  {
       // begin program menu
   System.out.println("");
   System.out.println("");
   System.out.println("***************************");
   System.out.println("----Inventory Valuation---");
   System.out.println("***(Weighted Average Method)***");
   System.out.println(""); 
   System.out.println("");
   System.out.println("--------- M E N U ---------");
   System.out.println("");
   System.out.println("");
      
  }//end method
  
  static double AverageCost(double totValue, double sumItems)
  {
      double average=0;
      average = totValue / sumItems;
      
      System.out.println("average cost :  $" + average);
      System.out.println("***************************");
      
      return average;
  }
  
  static double ComputeTax(double totValue, double SumItems)
  {
      double Tax=0;
      Tax =  (totValue * 0.06);
      System.out.println("At a level of " + SumItems + " units, the inventory "
              + "tax is $  "+ Tax);
      
      return Tax;
  }
  
 }// end class

