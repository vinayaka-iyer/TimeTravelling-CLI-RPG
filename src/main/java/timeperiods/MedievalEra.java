package timeperiods;

public class MedievalEra extends TimePeriod {
    public MedievalEra() {
        super("Medieval Era (1100 AD)");
    }

    @Override
    public void encounterEvent() {
        System.out.println("🏰 You arrive in a medieval kingdom! A knight challenges you to a duel. Do you fight (1) or run (2)?");
    }

}
