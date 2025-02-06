package timeperiods;
import java.util.Scanner;

public class CyberpunkFuture extends TimePeriod {
    public CyberpunkFuture() {
        super("Cyberpunk Future (2100 AD)");
    }

    @Override
    public void encounterEvent() {
        System.out.println("🌆 The neon lights of the future blind you. A hacker offers you a job.");
        System.out.println("Do you accept (1) or refuse (2)?");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("💻 You accept the hacker's job offer!");
        } else if (choice == 2) {
            System.out.println("🚫 You refuse the hacker's job offer.");
        } else {
            System.out.println("❌ Invalid choice. Try again.");
            encounterEvent();  // Recursively ask for input until valid
        }
    }
}
