package timeperiods;
import java.util.Scanner;

public class MedievalEra extends TimePeriod {
    public MedievalEra() {
        super("Medieval Era (1100 AD)");
    }

    @Override
    public void encounterEvent() {
        System.out.println("🏰 You arrive in a medieval kingdom! A knight challenges you to a duel.");
        System.out.println("Do you fight (1) or run (2)?");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("⚔️ You engage in a duel with the knight!");
        } else if (choice == 2) {
            System.out.println("🏃‍♂️ You run away from the knight!");
        } else {
            System.out.println("❌ Invalid choice. Try again.");
            encounterEvent();  // Recursively ask for input until valid
        }
    }
}
