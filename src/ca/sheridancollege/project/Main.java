/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author asus
 */
public class Main {

    public static void main(String[] args) {
        BlackjackGame blackjackGame = new BlackjackGame();

        // Create a dealer and add it to the game
        Dealer dealer = new Dealer("Dealer");
        blackjackGame.addPlayer(dealer);

        // Add other players if needed
        Player player = new Player("Alice") {
    @Override
    public void play() {
        // Implement play logic for the player
    }
};


        // Start the game
        blackjackGame.play();
    }
}


