package io.learn.stream;

import java.util.Arrays;

public class Fastdata {

    public static void main(String[] args) {
        
    int[] people = new int[(int)Math.pow(10, 8)];

    Arrays.setAll(people, e -> (int) (Math.random() * 120));

    double averageAge = Arrays.stream(people).parallel().average().orElseThrow();
    System.out.printf("%s %d %s %.2f%n", "Average age of", people.length, "population is", averageAge );
    
    }

}
