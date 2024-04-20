/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author tybutler
 */
public class Dealer {
    private String name;
    private Hand hand;

    public Dealer(String name, Hand hand) {
        this.name = name;
        this.hand = hand;
    }
    
    public int getHandValue(){
        return hand.getHandValue();
    }
    
    public Hand getHand(){
        return hand;
    }
    
    public void addCard(Card card){
        hand.addCard(card);
    }
}
