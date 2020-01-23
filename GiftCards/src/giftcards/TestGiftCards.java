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
		
import javax.swing.JOptionPane;
public class TestGiftCards 
//Sammy Student
{
    public static void main(String[] args)
    {
        GiftCards gc = new GiftCards("", 0.0);
		
        // display opening message
	String message = "welcome";
        JOptionPane.showMessageDialog(null, "Message: " + message,
	"Message", JOptionPane.PLAIN_MESSAGE);	
        
        // set the gift card holder's name
	String str = JOptionPane.showInputDialog(null, "gift card holder's name : ");
        gc.setHolder(str);
        
        // obtain the gift card number
	str = JOptionPane.showInputDialog(null, "gift card number : ");		
        gc.cardNum = Integer.parseInt(str);
        
	
// set the gift card amount

	str = JOptionPane.showInputDialog(null, "gift card amount : ");
        gc.setBalance(Double.parseDouble(str));

// EXECUTE CARD TYPE
        str = JOptionPane.showInputDialog(null, "Card Type : S = Store Credit | R = Regular Card");
        gc.CardType(str);     
       
// issue the gift card

        gc.IssueGiftCard();	
	
// use the gift card

	double useCard = 0;
        str = 
	JOptionPane.showInputDialog(null, "deduct amount from card : ");
        
	// verify amount to deduct will not yield negative balance                
        gc.Withdraw(Double.parseDouble(str));
        gc.Withdraw(Double.parseDouble(str));

        // print current card balance
	
        gc.printCurrentGiftCardInfo(useCard);
	}
}

