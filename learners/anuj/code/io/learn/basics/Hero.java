package io.learn.basics;

public class Hero {
    
    public String planet;
    private String secretWeapon;
    public int damage = 11;

    public Hero() {
        planet = "Earth";
    }

    // constructor chaining
    public Hero(String weapon) {
        this();
        secretWeapon = weapon;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %d", "Planet", planet, "Secret Weapon", secretWeapon, "Damage", damage);
    }

    // Nested class
    class Weapon {
        {
            System.out.println("Inner Class Object init");
        }

        int powerUp = 2;

        public int getMaxDamage() {
            return powerUp * damage;
        }

        public void powerUp(int p) {
            powerUp += p;
        }
    }

}
