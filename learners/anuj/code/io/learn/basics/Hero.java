package io.learn.basics;

public class Hero {
    
    public Planet planet;
    private String secretWeapon;
    public int damage = 11;

    public Hero() {
        planet = Planet.EARTH;
    }

    // constructor chaining
    public Hero(String weapon) {
        this();
        secretWeapon = weapon;
    }

    public Hero(Planet planet, String secretWeapon, int damage) {
        this.planet = planet;
        this.secretWeapon = secretWeapon;
        this.damage = damage;
    }

    // Nested class
    class Weapon {
        {
            System.out.println("Inner Class Object init");
        }

        int powerUp = 2;
        int damage = 1;

        public int getMaxDamage() {
            return powerUp * Hero.this.damage;
        }

        public void powerUp(int p) {
            powerUp += p;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %d", "Planet", planet, "Secret Weapon", secretWeapon, "Damage", damage);
    }
}
