/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author tybutler
 */
public class Hand {
    
    private ArrayList<Card> cards;
    
    public void addCard(Card card){
        cards.add(card);
    }
    
    public int getHandValue(){
        int counter = 0;
        for(int i=0; i< cards.size(); i++){
           Card card = cards.get(i);
           counter += card.getValue();
        }
        return counter;
    }
    
    public ArrayList<Card> getCards(){
        return cards;
    }
    
    public void clearHand(){
        cards.clear();
    }
    
}
