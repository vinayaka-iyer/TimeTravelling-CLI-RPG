package timeperiods;
import java.util.Scanner;


public class DinosaurAge extends TimePeriod {
    public DinosaurAge() {
        super("Dinosaur Age (65 Million BC)");
    }
    @Override
    public void encounterEvent() {
        System.out.println("🦖 A massive T-Rex roars as it charges towards you.");
        System.out.println("Do you run (1) or freeze (2)?");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("🦖 You try to outrun the dinosaur!");
        } else if (choice == 2) {
            System.out.println("🛑 You freeze in fear as the dinosaur approaches!");
        } else {
            System.out.println("❌ Invalid choice. Try again.");
            encounterEvent();  // Recursively ask for input until valid
        }
    }
}
