package io.learn.function;
import java.util.List;

import io.learn.basics.Hero;
import io.learn.basics.Planet;

public class Functions {

    List<Hero> heros = List.of(new Hero(Planet.EARTH, "Shield", 5), new Hero(Planet.EARTH, "Web-Shooters", 10), new Hero(Planet.MARS, "Lasso", 20));
    public static void main(String[] args) {
        System.out.println("Functions");
        Functions f = new Functions();
        f.deployHero(f.heros, p -> p.damage > 10);
        f.deployHero(f.heros, p -> p.damage < 9);
        f.deployHero(f.heros, p -> p.planet == Planet.EARTH);
    }

    public void deployHero(List<Hero> hList, SelectHero s) {
        for(Hero h: hList)
            if(s.select(h))
            System.out.printf("%s %s%n", "Selected", h);
    }
}
