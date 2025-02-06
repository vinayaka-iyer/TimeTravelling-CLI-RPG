# Time Travel Adventure Game

## Description

Time Travel Adventure is an interactive Java-based role-playing game (RPG) that lets you travel through different time periods. The game allows players to explore medieval kingdoms, futuristic cyberpunk cities, and ancient dinosaur times, with gameplay choices affecting the player's health and coins. It showcases several key Object-Oriented Programming (OOP) concepts such as inheritance, polymorphism, encapsulation, and abstraction.

## Key Features
- Travel through different time periods: Medieval Era 🏰, Cyberpunk Future 🌆, Dinosaur Age 🦖.
- Encounter events based on the time period chosen.
- RPG mechanics: Players gain or lose health and coins depending on their choices.
- Health and coins attributes for the player that affect gameplay.
- Ability to heal, gain coins, and take damage.

## OOP Concepts Demonstrated

### 1. **Inheritance**
The game leverages inheritance by having a `TimePeriod` abstract class that is extended by concrete classes like `MedievalEra`, `CyberpunkFuture`, and `DinosaurAge`. Each time period shares common functionality (i.e., name and event interaction) but also defines its unique behavior.

**Example**:
```java
public abstract class TimePeriod {
    private String name;
    
    public TimePeriod(String name) {
        this.name = name;
    }
    
    public abstract void encounterEvent(TimeTraveller player); // Abstract method for different time periods
}
```

### 2. **Polymorphism**
Polymorphism is demonstrated through method overriding. Each subclass of `TimePeriod` overrides the `encounterEvent` method to provide a different interaction based on the time period selected by the player. The `travelTo` method in the `TimeTraveller` class calls `encounterEvent` dynamically, based on the actual object (i.e., `MedievalEra`, `CyberpunkFuture`, `DinosaurAge`) passed at runtime.

**Example**:
```java
public void encounterEvent(TimeTraveller player) {
    if (this instanceof MedievalEra) {
        // Handle Medieval Era event
    } else if (this instanceof CyberpunkFuture) {
        // Handle Cyberpunk Future event
    }
    // and so on
}
```

### 3. **Encapsulation**
Encapsulation is shown by the `TimeTraveller` class, where the player's attributes (name, health, coins) are kept private. Access to these attributes is only provided via public methods like `getHealth()`, `gainCoins()`, and `takeDamage()`. This protects the integrity of the player's data by limiting external access and modifying it only through controlled methods.

**Example**:
```java
private int health;
private int coins;

public int getHealth() {
    return health;
}

public void gainCoins(int amount) {
    coins += amount;
    System.out.println("💰 You've gained " + amount + " coins! Total: " + coins);
}
```

### 4. **Abstraction**
Abstraction is utilized by the `TimePeriod` class, which is abstract and cannot be instantiated directly. Specific time periods like `MedievalEra`, `CyberpunkFuture`, and `DinosaurAge` provide the concrete implementation for the encounter events, abstracting the complexity from the player. The player interacts with these time periods through the common interface provided by `TimePeriod` without worrying about the specific implementation.

**Example**:
```java
public abstract class TimePeriod {
    public abstract void encounterEvent(TimeTraveller player);
}
```

## Technologies Used

- Java (JDK 21.0.5)
- Maven (3.9.9)
- Git

## Requirements

- Java Development Kit (JDK) version 8 or higher
- A Java IDE (e.g., IntelliJ IDEA, VSCode)

## How to Run

### 1. Clone the Repository
If you have Git installed, clone this repository to your local machine:
```bash
git clone https://github.com/yourusername/time-travel-adventure-game.git
cd time-travel-adventure-game
```

### 2. Compile the Program
If you're using an IDE, simply run the project. If you're compiling from the command line:
```bash
javac -d bin src/game/*.java src/timeperiods/*.java src/ui/*.java
```

### 3. Run the Game
To start the game, run the `Main` class:
```bash
java Main
```

### 4. Play the Game
- The game will prompt you to input your name.
- You will then choose a time period to travel to and make decisions based on events that unfold in that period.

## Version Control (Git)

The development of this project is tracked using Git:
To view the commit history, run the following command:
```bash
git log --oneline
```

## Future Enhancements

- Add more time periods with unique events.
- Introduce an inventory system to store items.
- Add leveling up and experience points.
- Implement save/load game functionality.
