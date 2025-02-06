package timeperiods;

public class DinosaurAge extends TimePeriod {
    public DinosaurAge() {
        super("Dinosaur Age (65 Million BC)");
    }
    @Override
    public void encounterEvent() {
        System.out.println("🦖 A T-Rex spots you! Do you hide (1) or try to tame it (2)?");
    }
}
