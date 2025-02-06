package timeperiods;

import game.TimeTraveller;
import java.util.Scanner;

public class DinosaurAge extends TimePeriod {

    public DinosaurAge() {
        super("Dinosaur Age 🦖");
    }

    @Override
    public void encounterEvent(TimeTraveller player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🦖 You encounter a massive dinosaur! Do you fight (1) or run (2)?");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("⚔️ You chose to fight the dinosaur!");
            player.takeDamage(50); // Dinosaur does heavy damage
            player.gainCoins(200); // Huge reward for fighting the dinosaur
        } else if (choice == 2) {
            System.out.println("🏃 You chose to run away from the dinosaur.");
            player.loseCoins(30); // Running away costs coins
        } else {
            System.out.println("Invalid choice! Try again.");
        }
    }
}

