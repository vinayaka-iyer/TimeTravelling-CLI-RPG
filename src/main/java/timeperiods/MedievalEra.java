package timeperiods;

import game.TimeTraveller;
import java.util.Scanner;

public class MedievalEra extends TimePeriod {

    public MedievalEra() {
        super("Medieval Era 🏰");
    }

    @Override
    public void encounterEvent(TimeTraveller player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🏰 You arrive in a medieval kingdom! A knight challenges you to a duel. Do you fight (1) or run (2)?");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("⚔️ You chose to fight the knight!");
            player.takeDamage(20); // Knight damages the player
            player.gainCoins(50);  // You gain coins for fighting
        } else if (choice == 2) {
            System.out.println("🏃 You chose to run away from the knight.");
            player.loseCoins(10);  // Running away costs coins
        } else {
            System.out.println("Invalid choice! Try again.");
        }
    }
}
