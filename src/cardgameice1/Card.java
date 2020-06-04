/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;

import java.util.Random;

/**
 *
 * @author srinivsi
 
 private variable then refactor it
 * - encapsulate fields (encapsulation principle) 
 getters/setters
 */
public class Card 
{
  private String suits;//diamonds,clubs,spades, hearts
  private int value; // 1 to 13
public static final String[] SUITS={"diamonds","clubs","spades","hearts"};
    
    public String getSuits() {
         Random r=new Random();
        int randomSuit=r.nextInt(SUITS.length);
       String suitss = SUITS[randomSuit];
   this.suits = suitss;
        return suits;
    }

    
    public void setSuits(String suits) {
   this.suits = suits;
    }

    
    public int getValue() {
      Random rn = new Random();
      int val;
      val = rn.nextInt(13) + 1;
       this.value = val;
        return value;
    }

    
    public void setValue(int value) {
        this.value = value;
    }
    
    
    
//public int randomValue()
//{
    //int value= // 
           // return value;
//}

    @Override
    public String toString() {
        return "Card{" + "suits=" + suits + ", value=" + value + '}';
    }
   

}
