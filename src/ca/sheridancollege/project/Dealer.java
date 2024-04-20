/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author tybutler
 */
public class Dealer extends Player {

    public Dealer(String name) {
        super(name);
    }

    @Override
    public void play() {
        // Implement dealer's play logic here
        // For example, in Blackjack, the dealer usually hits until their hand value is 17 or higher
    }
    @Override
    public int getHandValue() {
        return getHand().getHandValue();
    }
    @Override
    public Hand getHand() {
        return super.getHand();
    }
    @Override
    public void addCard(Card card) {
        super.addCard(card);
    }
}
