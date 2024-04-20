/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class BlackjackGame extends Game {

    public BlackjackGame() {
        super("Blackjack");
        players = new ArrayList<>(); // Initialize the players list
    }

    @Override
    public void play() {
        // Implement your Blackjack game logic here
        // This should include dealing cards, player turns, dealer's turn, determining the winner, etc.
    }

    public void addPlayer(Player player) {
    players.add(player);
}






   public void addDealer(Dealer dealer) {
    players.add(dealer);
}
   


    // Add any additional methods specific to Blackjack
}


