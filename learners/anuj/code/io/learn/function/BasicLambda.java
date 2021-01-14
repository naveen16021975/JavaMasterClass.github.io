package io.learn.function;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Showcase Lambda functions
 * @author Anuj Jain
 */
public class BasicLambda {
    public static void main(String[] args) {

        Supplier<Long> supplier = () -> Math.round(Math.random() * 1000);
        System.out.printf("%s %d%n", "Supplier Output:", supplier.get());

        Consumer<String> consumer = (String message) -> System.out.printf("%s %s%n", "Consumer Output:", message);
        consumer.accept("Hello World!");
    }    
}
