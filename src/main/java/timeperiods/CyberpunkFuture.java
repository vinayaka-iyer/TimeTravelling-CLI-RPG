package timeperiods;

public class CyberpunkFuture extends TimePeriod {
    public CyberpunkFuture() {
        super("Cyberpunk Future (2100 AD)");
    }

    @Override
    public void encounterEvent() {
        System.out.println("🌆 The neon lights of the future blind you. A hacker offers you a job. Do you accept (1) or refuse (2)?");
    }
}
