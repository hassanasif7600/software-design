/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;

/**
 *
 * @author srinivsi
 print 7 cards (values,suits) and takes input 
 then prints if matching card is found in an array
 */

import java.util.Scanner;


public class CardGameICE1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       // code to generate 7 random cards and store in array
        Card[] magicHand = new Card[7];//array of object

        for (int i=0;i<magicHand.length;i++)
        {
         Card c= new Card();//object
           c.getValue();
           c.getSuits();
           magicHand[i]=c;//saving object in array
        }   
        
        
        
            for (int i=0;i<magicHand.length;i++){
         System.out.println( magicHand[i] );
        }  
         
        
        
          Scanner input = new Scanner(System.in);
        System.out.println("Entre value");
        int value = input.nextInt();
        
        System.out.println("Entre suit");
        String suit;
        suit = input.nextLine();
        
        System.out.println();
        
         Card t= new Card();//object
        t.setValue(value);
        t.setSuits(suit);
        boolean match = false;
        
         for (int i=0;i<magicHand.length;i++){
     if( magicHand[i]==t ) {
               match = true;
                    System.out.println(match);
     } 
        }        


         
    
    }
    
}
