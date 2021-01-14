package io.learn.function;

import io.learn.basics.Hero;

@FunctionalInterface
public interface SelectHero {
    public boolean select(Hero hero);
}