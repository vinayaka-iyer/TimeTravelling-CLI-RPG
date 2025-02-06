package timeperiods;

import game.TimeTraveller;

public abstract class TimePeriod {
    private String name;

    public TimePeriod(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void encounterEvent(TimeTraveller player); // Accept player object to modify stats
}

