/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giftcards;

/**
 *
 * @author Aamir
 */
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//Sammy Student

public class GiftCards
{
    private static Scanner scanner = new Scanner( System.in );
    private String ss;
    private char CD = 's';
 
 public void Today_Date(){   
  String pattern = "MM-dd-yyyy";
  
  Calendar ND = Calendar.getInstance();
  Date today = ND.getTime();
  SimpleDateFormat format_date = new SimpleDateFormat(pattern);
  System.out.printf(format_date.format(today));
 }
 
 //Card expiration 
 
 public void Expiring_Date(){
     String pattern = "yyyy";
     Calendar NF = Calendar.getInstance();
     SimpleDateFormat format_date = new SimpleDateFormat(pattern);
     NF.add(Calendar.YEAR, 1);
     Date NextYear = NF.getTime();
     System.out.printf( format_date.format(NextYear));
             
 }
// define the class data members  
 public boolean expires;
  private double balance;
  public int cardNum;
  public String issueDate;
  private String holder; 
  public double e;
  
  
  // define the member methods
  // default constructor
  public GiftCards() {}
  // overloaded constructor
  public GiftCards(String n, double amt) 
  {
    holder = n;
    balance = amt;
    
  }
  public void IssueGiftCard() 
  {
	  System.out.println("");
	  System.out.println(" Card Issued");
          System.out.printf(" Today's Date is . . . " );
          Today_Date();
          System.out.println("");
          System.out.println(" Card Holder . . . " + holder);
          System.out.println(" Card Number . . . " + cardNum);
	  System.out.printf(" Card Amount . . . $%.2f" , balance);
          System.out.println("");
          System.out.printf(" Expires . . . ");
          Expiring_Date();
          System.out.println("");
  }
  		
public void CardType(String t){   
    String CardType;
    char CD = t.charAt(0);
    //char CD= scanner.next().charAt(0);
    
    if (CD == 's' || CD == 'S'){
        CardType = "Store Credit";
        System.out.println("Gift Card Type . . . " + CardType);
    }
    else if (CD == 'R' || CD == 'r'){
        CardType = "Regular Gift Card";
        System.out.println("Gift Card Type . . . " + CardType);
    }
    
}

  public double getBalance()
  {
    return balance;
  }
  public void setBalance(double b) 
  {
    balance = b;
  }
  public String getHolder()
  {
    return holder;
  }

  public void setHolder(String h) 
  {
    holder = h;
  }
  
  public void printCurrentGiftCardInfo(double spend) 
  {
	  System.out.println("");
	  System.out.println(" Card Balance");
	  System.out.printf(" Today's Date is . . . " );
          Today_Date();
          System.out.println("");
          System.out.printf(" Amount Deducted . . . $%.2f", e , "\n");
          System.out.println("");
	  System.out.printf(" Card Amount . . . $%.2f" , balance);
          System.out.println("");
  }
  
  public double Withdraw(double w){
     
      e =  w;
      
      if(w <= balance)
      {
          balance = balance - w;          
      }
      else 
      {
          System.out.println("");
          System.out.println(" You do not have enough balance for this transaction!");
          System.out.println("");
      }
      return balance;
  }
}
  