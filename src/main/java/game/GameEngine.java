package game;

import timeperiods.*;
import java.util.Scanner;

public class GameEngine {
    private TimeTraveller player;
    private Scanner scanner = new Scanner(system.in);

    public GameEngine(string playerName) {
        this.player = new TimeTraveller(playerName);
    }

    public void start() {
        while(true) {
            System.out.println("\n📅 Choose a time period to travel to:");
            System.out.println("(1) Medieval Era 🏰");
            System.out.println("(2) Cyberpunk Future 🌆");
            System.out.println("(3) Dinosaur Age 🦖");
            System.out.println("(4) Exit 🚪");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear input buffer

            if (choice == 4) {
                System.out.println("🌌 You've returned to the present. Goodbye!");
                break;
            }

            Timeperiod period = switch (choice) {
                case 1 -> new MedievalEra();
                case 2  -> new CyberpunkFuture();
                case 3 -> new DinosaurAge();
                default -> {
                    System.out.println("Invalid choice! Try again");
                    yield null;
                }
            };

            if (period != null) {
                player.travelTo(period);
            }
        }
    }
}
