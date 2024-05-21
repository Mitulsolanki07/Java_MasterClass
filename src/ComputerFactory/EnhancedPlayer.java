package ComputerFactory;

public class EnhancedPlayer {
    private String fullname;
    private int healthPercentage;
    private String weapon;

    protected EnhancedPlayer(String fullname) {
        this(fullname, 100, "Sword");
    }

    public EnhancedPlayer(String fullname, int healthPercentage, String weapon) {
        this.fullname = fullname;
        if (healthPercentage < 1) {
            this.healthPercentage = 1;
        } else if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = healthPercentage;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.healthPercentage -= damage;
        if (this.healthPercentage < 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining() {
        return this.healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        this.healthPercentage += extraHealth;
        if (this.healthPercentage > 100) {
            System.out.println("Player restored to 100%");
            this.healthPercentage = 100;
        }
    }
}
