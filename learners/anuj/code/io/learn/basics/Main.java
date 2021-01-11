package io.learn.basics;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main {

    int[] javaVersions = {1,2,5,7,8,9,10,11,12,13,14,15};

    public void print() {
        System.out.printf("Object %s%n", javaVersions);
        System.out.printf("Arrays.toString() %s%n", Arrays.toString(javaVersions));
        System.out.printf("%d", Arrays.binarySearch(javaVersions, 3));
    }

    public void flashPrint() throws InterruptedException {
        for(int i = 0; i < 10; i++) {
            System.out.print("\t\t" + i + "\r");
            TimeUnit.MILLISECONDS.sleep(500);
        }
            System.out.printf("%s%n","Hello from JMC 2021 !");
    }

    public static void main(String[] args) throws InterruptedException {
        new Main().flashPrint();
    }
}
