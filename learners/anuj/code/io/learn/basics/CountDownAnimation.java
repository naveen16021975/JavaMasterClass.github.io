package io.learn.basics;

import java.util.concurrent.TimeUnit;

/**
 * Print a countdown banner before hello world!
 */
public class CountDownAnimation {

    public void flashPrint() throws InterruptedException {
        for(int i = 0; i < 10; i++) {
            System.out.print("\t\t" + i + "\r");
            TimeUnit.MILLISECONDS.sleep(500);
        }
            System.out.printf("%s%n","Hello from JMC 2021 !");
    }

    public static void main(String[] args) throws InterruptedException {
        new CountDownAnimation().flashPrint();
    }
}
