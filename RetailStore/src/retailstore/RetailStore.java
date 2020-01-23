
 package retailstore;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
// Sammy Student

public class RetailStore 
{
  Scanner scan = new Scanner(System.in);
  
  
  
  public static void main(String args[])
  {
	  int rows = 8;
	  int columns = 11;
	  int[ ][ ] table = new int[rows][columns];
          double [] sum1 = new double [100];
          double average = 0.0, sum = 0.0;
          int TotCust =0;
	  Random randomGen = new Random();
	  StringBuilder s = new StringBuilder();
          int [] LanAve = new int[9];
          int [] HrAve = new int [9];
          int[] NewCheck = new int[8];
          int L1 = 0;
          
	  int randomInt1 = 0;
	  int randomInt2 = 0;
	  
	  // generate column titles
         
	  for (int j = 0; j < 8; j++)
	  {
		  s.append("\thr" + (j + 1)+"  ");
	  }
          s.append("Average");
	  s.append("\n\n");
         
	  // populate data for each cashier lane
          // Also for the average on the side
	  for (int i = 0; i < 8; i++){
		   s.append("lane " + (i + 1)+ " ");
          	   s.append("\t");
                   
		  for (int j = 0; j < 8; j++)
		  {
			  // express checkout lane
			  randomInt1 = 1 + randomGen.nextInt(20);
			  // standard checkout lane
			  randomInt2 = 1 + randomGen.nextInt(10);
			  if(i == 0){ 
				  table[i][j] = randomInt1;
                                  TotCust += table[i][j];
                          }
			  else 
                          {table[i][j] = randomInt2;
                           TotCust += table[i][j];
                          } 
                          s.append(table[i][j]);
                          s.append(" ");
                          s.append("\t");
                  }
                        for (int j2 = 0; j2 < 8 ; j2++){ //ADDING SUM FOR THE WHOLE COLUMN
                        sum += table[i][j2];
                        sum1[j2] = sum;
                        }    
                        average = sum / 8; // FINDING THE AVERAGE OF THE SUM
                        
                        if(average > 10){
                            int ave = (int) average; //CONVERTING AVERAGE TO AN INT
                            int lanes = 0;
                            LanAve[i] = ave;
                            NewCheck[i] = (i+1); // ADD the lanes to 1 array
                            
                        } // end if stavement (average) 
                        
                        Math.round(average);  // ROUNDING THE AVERAGE
                        int ave = (int) average; //CONVERTING AVERAGE TO AN INT
                            table[i][9] = ave; // ADDING THE AVE TO THE 9TH ROW
                            s.append(table[i][9]); //UPDATING THE TABLE 9TH ROW
                            sum=0; 
                            s.append("\n");
                            
                        } // end i loop
          
          s.append("\n");
          s.append("Average");
          
          //FOR AVERAGE OF THE BOTTOM
          
          for(int r1 = 0; r1 <8; r1++){
             for (int j = 0; j < 7 ; j++){
                 sum += table[j][r1];
                } //end for j
             
	  average = sum / 7;
          
          int ave = (int) average;
          
          table[7][r1] = ave;
          s.append( "\t" + table[7][r1] );
          sum =0;
          } //end for r1 loop
          
          s.append("\t" + TotCust);
          s.append("\n");
          s.append("Total Customers served today ->" + TotCust);
          s.append("\nNeed a New baggager at Lanes -> " + Arrays.toString(NewCheck));
          System.out.println(s);
          
// LANE STATISTICS

          String str = JOptionPane.showInputDialog(null,"Enter a cashier Lane Number : ");
          int laneNum = Integer.parseInt(str)-1;
          
          String outputMsg = "";         
	  outputMsg += "\n for cashier lane " + (laneNum + 1);
	  outputMsg += "\n the data analysis is: ";
	  outputMsg += "\n customer count -> 27";
	  outputMsg += "\n average -> " + Math.round(table[laneNum][9]);
          JOptionPane.showMessageDialog(null, outputMsg,
	  "Data Row Analysis", JOptionPane.PLAIN_MESSAGE);

// HOUR STATISTICS
        
         str = JOptionPane.showInputDialog(null, "enter an hour number : ");
         // subtract 1 to compensate for a zero indexed array
	  int hourNum = Integer.parseInt(str) - 1;
          String outputMsg1= "";
          outputMsg1 += "\n for cashier lane " + (hourNum + 1);
	  outputMsg1 += "\n the data analysis is: ";
	  outputMsg1 += "\n customer count -> 18";
	  outputMsg1 += "\n average -> " + Math.round(table[7][hourNum]);
          JOptionPane.showMessageDialog(null, outputMsg1,
	  "Data Row Analysis", JOptionPane.PLAIN_MESSAGE);
          System.out.println("\n\n\n\n\n");
  }// end main 
} // class