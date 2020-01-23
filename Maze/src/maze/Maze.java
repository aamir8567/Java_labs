/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze;

import java.util.Scanner;
 //Sammy Student, Programmer
 public class Maze 
 {
  static Scanner sc = new Scanner(System.in);
  // maze movements
  static char myMove = '\0';
  // cell position
  static int currentCell = 0;
  static int score = 0;
  static boolean advance = true;
  static boolean checkThis = false;
  
  public static void main(String args[])
  {
   // the local variables declared and initialized
   char answer = 'Y';
  
   displayMenu();  
      
   while(answer == 'Y' || answer == 'y') 
   {
	displayMovement();
	makeYourMove();
	checkThis = checkYourMove();
	mazeStatus();
      
	System.out.println("move again(Y or N)?");
      answer = sc.next().charAt(0);
      
  }
   System.out.println("***************************");
}// end main() method

static void displayMenu()
{
   System.out.println("");
   System.out.println("***************************");
   System.out.println("----The Maze Strategy---");
   System.out.println("");
}// end method

static void displayMovement()
{
	if(currentCell == 0)
	{
		System.out.println("You have entered the maze!!");
		System.out.println("There is no turning back!!");
		currentCell = 1;
		mazeStatus();
		advance = true;
	}
      System.out.println("");
      System.out.println("make your move (W, A, S, D)");
      System.out.println("W = up, A = left, S = down, D = right)");
      System.out.println("");
}// end method

static void makeYourMove()
{
	myMove = sc.next().charAt(0);
	
	switch(myMove)
	{
	  case 'W': { MoveUp(); break; }
	  case 'A': { MoveLeft(); break; }
	  case 'S': { MoveDown(); break; }
	  case 'D': { MoveRight(); break; }
	}
   // end program menu
 }// end method
static boolean checkYourMove()
{
    // CELL 1
	if(currentCell == 1 && advance == true)
	{
		if (myMove == 'W')
		{
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'A')
		{
			advance = false;
			System.out.println("SORRY, there is no return");
			return advance;
		}
		

		if (myMove == 'D')
		{
			currentCell = 2;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'S')
		{
			advance = false;
			System.out.println("continue through the maze");
			return advance;
		}
	}
    
    // CELL 2
    
	if(currentCell == 2 && advance == true)
	{
		if (myMove == 'W')
		{
			advance = false;
			System.out.println("try again");
			return advance;
		}
		if (myMove == 'A')
		{
			advance = false;
			System.out.println("SORRY, there is no return");
			return advance;
		}
		if (myMove == 'D')
		{
			advance = false;
			System.out.println("continue through the maze");
			return advance;
		}
		if (myMove == 'S')
		{
			currentCell = 5;
			advance = true;
			System.out.println("continue through the maze");
			return advance;
		}
	}
        
    // CELL 5
    
        if(currentCell == 5 && advance == true)
        {
            if (myMove == 'W')
            {
                advance = false;
                System.out.println("Try Again");
                return advance;
            }
            if (myMove == 'A')
            {
                advance = false;
                System.out.println("Sorry, there is no return");
                return advance;
            }
            if (myMove == 'D')
            {
                currentCell = 6;
                advance = true;
                System.out.println("Continue Through the Maze");
                return advance;
            }
            if (myMove == 'S')
            {
                advance = false;
                System.out.println("Continue through the Maze");
                return advance;
            }
        }
        
    // CELL 6
    
        if(currentCell == 6 && advance == true)
        {
            if (myMove == 'W')
            {
                advance = false;
                System.out.println("Try Again");
                return advance;
            }
            if (myMove == 'A')
            {
                advance = false;
                System.out.println("Sorry, there is no return");
                return advance;
            }
            if (myMove == 'D')
            {
                advance = false;
                System.out.println("Continue Through the Maze");
                return advance;
            }
            if (myMove == 'S')
            {
                currentCell = 9;
                advance = true;
                System.out.println("Continue through the Maze");
                return advance;
            }
        }
        
    // CELL 9
    
        if(currentCell == 9 && advance == true)
        {
            if (myMove == 'W')
            {
                advance = false;
                System.out.println("Try Again");
                return advance;
            }
            if (myMove == 'A')
            {
                advance = false;
                System.out.println("Sorry, there is no return");
                return advance;
            }
            if (myMove == 'D')
            {
                advance = false;
                System.out.println("Continue Through the Maze");
                return advance;
            }
            if (myMove == 'S')
            {
                currentCell = 10;
                advance = true;
                System.out.println("Continue through the Maze");
                return advance;
            }
        }
        
    // CELL 6
    
    if(currentCell == 10 && advance == true)
        {
            System.out.println("Thank you for playing the game.");
            System.out.println("Have a great day!");
        }
   
	return advance;
	// end program menu
 }// end method

static void MoveLeft()
{
    System.out.println("");
   System.out.println("you moved to the left");
   
}//end method
static void MoveRight()
{
    System.out.println("");
	 System.out.println("you moved to the right");
	
}//end method
static void MoveUp()
{
    System.out.println("");
	System.out.println("you moved up (forward)");
	
}//end method
static void MoveDown()
{
    System.out.println("");
	System.out.println("you moved down (downward)");
	
}//end method
static void mazeStatus()
{
    System.out.println("");
	System.out.println("current position: cell " + currentCell);
}//end method
}// end class


