package game;

import timeperiods.TimePeriod;

public class TimeTraveller {
    private String name;
    private int health;

    public TimeTraveller(String name) {
        this.name = name;
        this.health = 100;
    }

    public void travelTo(TimePeriod Period) {
        System.out.println("\n✨ You have traveled to " + period.getName());
        period.encounterEvent();
    }

    public void takeDamage(int damage) {
        health -= damange;
        if (health <=0) {
            System.out.println("💀 Oh no! You've died in a time paradox!");
            System.exit(0);
        }
    }

    public String getName(){
        return name;
    }
}
