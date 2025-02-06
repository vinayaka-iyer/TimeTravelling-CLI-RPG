package ui;

import game.GameEngine;
import java.util.Scanner;

public class TextUI {
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name, Time Traveler: ");
        String playerName = scanner.nextLine();

        GameEngine game = new GameEngine(playerName);
        game.start();
    }
}