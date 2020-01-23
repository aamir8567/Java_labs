/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountholder;
import java.util.Scanner;

/**
 *
 * @author Aamir
 */
public class AccountHolder {

    /**
     * @param args the command line arguments
     */
       static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int s;
        double w;
        double d;
        int l=0;
        
        AccountHolderTest test = new AccountHolderTest();
        System.out.println("");
        System.out.println("");
       
        while (l<=100){
        System.out.println("Would You like to Withdraw money or Deposit money?");
        System.out.println("Please enter the following");
        System.out.println("1) for Withdraw");
        System.out.println("2) for Deposit");
        s = sc.nextInt();
        
        if( s == 1)
        {
            System.out.println("Please Enter Withdraw Ammount ==> ");
            w = sc.nextDouble();
            test.withdraw(w);
        }
        else if ( s == 2)
        {
            System.out.println("Please Enter Deposit Ammount ==> ");
            d = sc.nextDouble();
            test.deposit(d);
        }
            System.out.println("");   
        l++;
        }
    }

    }