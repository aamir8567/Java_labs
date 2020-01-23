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
public class AccountHolderTest {
    double balance;
    double deposit;
    double withdraw;
    double AnnualIntrestRate = 0.04;
    static Scanner sc = new Scanner(System.in);
    String name;

    public AccountHolderTest( ){
    //this.balance= balance;
    //this.name=name;
        System.out.println("*********************");
        System.out.println("*******WELCOME*******");
        System.out.println("*********************");
        System.out.println("");
        System.out.println("Please Enter the USER Name ==> ");
        this.name = sc.nextLine();
        System.out.println("Please Enter the Initial Balance ==> ");
        this.balance = sc.nextDouble();
        //this.deposit= deposit;
    }
    
    public void  deposit(double D){
        this.balance += D;
        System.out.println("Your balance afte the Deposit is ==> " + balance);
         //System.out.println("Deposit works");
         //return this.balance;
    }
    
    public void withdraw(double W){
        if (balance-W < 50)
        {
            System.out.println("Sorry You need to have atleast 50$ in your account");
        }
        else 
        {
            this.balance -= W;
            System.out.println("Your balance after withdraw is ==> "+ balance);
        }
    }
    
    public void monthlyIntrest(){
        balance += balance * (AnnualIntrestRate / 12.0);
    }
    
    public  void SetBalance( double x){
        this.balance = x; 
        System.out.println("Please Enter the Balance => ");
        //balance = sc.nextDouble();
    }
    
    public double getBalance(){
        return this.balance;
    }
}
