package timeperiods;

import game.TimeTraveller;
import java.util.Scanner;

public class CyberpunkFuture extends TimePeriod {

    public CyberpunkFuture() {
        super("Cyberpunk Future 🌆");
    }

    @Override
    public void encounterEvent(TimeTraveller player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🌆 The neon lights of the future blind you. A hacker offers you a job. Do you accept (1) or refuse (2)?");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("💻 You chose to accept the hacker's job.");
            player.gainCoins(100); // Gain coins for accepting the job
            player.heal(10); // Healing boost
        } else if (choice == 2) {
            System.out.println("🚫 You refuse the hacker's job.");
            player.loseCoins(20); // Lose coins for declining the offer
        } else {
            System.out.println("Invalid choice! Try again.");
        }
    }
}
