/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Main {

    public static void main(String[] args) {
          System.out.print("Welcome TO BlackJack ");
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.println("Username entered: " + username);

        scanner.close();
        BlackjackGame blackjackGame = new BlackjackGame();

        // Create a dealer and add it to the game
        Dealer dealer = new Dealer("Dealer");
        blackjackGame.addPlayer(dealer);

        // Add other players if needed
        Player player = new Player("Alice") {
    @Override
    public void play() {
          blackjackGame.play();
        // Implement play logic for the player
    }
};


        // Start the game
      
    }
}


