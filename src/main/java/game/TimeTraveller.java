package game;

import timeperiods.TimePeriod;

public class TimeTraveller {
    private String name;
    private int health;
    private int coins;

    public TimeTraveller(String name) {
        this.name = name;
        this.health = 100; // Starting health
        this.coins = 0; // Starting coins
    }

    public void travelTo(TimePeriod period) {
        System.out.println("\n✨ You have traveled to " + period.getName());
        period.encounterEvent(this); // Pass the player object to encounter events
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("💀 Oh no! You've died in a time paradox!");
            System.exit(0); // End game if health reaches 0
        }
    }

    public void gainCoins(int amount) {
        coins += amount;
        System.out.println("💰 You've gained " + amount + " coins! Total: " + coins);
    }

    public void loseCoins(int amount) {
        coins -= amount;
        if (coins < 0) coins = 0; // Prevent negative coins
        System.out.println("❌ You've lost " + amount + " coins. Total: " + coins);
    }

    public void heal(int amount) {
        health += amount;
        if (health > 100) health = 100; // Max health should be 100
        System.out.println("❤️ You've healed " + amount + " health. Current Health: " + health);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getCoins() {
        return coins;
    }
}
