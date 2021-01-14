package io.learn.basics;

public class Basics {

    {
        System.out.println("Object init");
    }

    static {
         System.out.println("Staitc init");
     }

    // static field
    public static int oneAndonly;

    // fields member variables
    public int id;
    public float weight = 3.1f;

    public Basics() {
        System.out.println("Default constructor");
    }

    public Basics(int param) {
        id = param;
        System.out.printf("%s %d%n", "Created with id", param);
    }

    public void moveUp(int increaseBy) {
        id += increaseBy;
    }

    // overloaded method
    public void moveUp(float increaseBy) {
        weight += increaseBy;
    }

    // var args
    public void moveUp(int... increaseBy) {
        for(int param: increaseBy) {
            id += param;
        }
    }

    // returning value from method
    public float getWeigth() {
        return weight;
    }
 
    public static void main(String[] args) {

         System.out.printf("%s %d%n", "Static variable", oneAndonly);
        
        // Create instance of a class
         // new Basics();
        // new Basics(5);
        Basics b = new Basics(10);

        // calling methods on object of a class
        b.moveUp(1);
        System.out.printf("%s %d%n", "Id ", b.id);

        // b.moveUp(2.4f);
        // System.out.printf("%s %f %n", "weight", b.getWeigth());

        b.moveUp(1,2,3,2,1,4,6);
        System.out.printf("%s %d%n", "Id (vararg)", b.id);

        // Declare an object
        Hero h;

        // Instantiation of an Object
         h = new Hero();

        // using assertions to check your code
        // // use -ea flag to run assertaions
        assert(h.planet == Planet.EARTH);
        System.out.println(h.planet);

        // Hero ancientHero = new Hero("Stone Weapons");
        // System.out.println(ancientHero);

        // Instantiation of an Object of Nested class
        Hero.Weapon w = h.new Weapon();
        System.out.printf("%s %d%n", "Maximum damage", w.getMaxDamage());

        // Calling method on nested class object
        w.powerUp(1);
        System.out.printf("%s %d%n", "Maximum damage after powerUp", w.getMaxDamage());
    }
}
