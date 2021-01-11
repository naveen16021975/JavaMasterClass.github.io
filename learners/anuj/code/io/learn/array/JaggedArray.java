package io.learn.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class JaggedArray {    
    public static void main(String[] args) {
        
        // create int array literal
        int[] profits = {400, 800, 600, 100, 200, 300, 700};
        printArray(profits);

        // binary search in an int array        
        int[] javaVersions = {1,2,3,5,7,8,9,11,12,13,14,15};
        printArray(javaVersions);
        System.out.printf("%d", Arrays.binarySearch(javaVersions, 3));    
        
        /**  Array of Array */
        String[][] names = {
            {"Mr.", "Mrs.", "Ms."},
             {"Kavita", "Kalyani"},
             {"Jain", "Gupta", "Agarwal", "Garg"}
        };

        System.out.printf("%s %s %s%n", names[0][1], names[1][0], names[2][0]);
        System.out.printf("%s %s %s%n", names[0][2], names[1][1], names[2][3]);

        // Copy array using System.arraycopy
         int[] dayProfit = new int[profits.length];
         System.arraycopy(profits, 0, dayProfit, 0, profits.length);
         printArray(dayProfit);

        // copy array using Arrays.copyof
         int[] weekendProfilt = Arrays.copyOf(profits, profits.length);
        printArray(weekendProfilt);

        // clone array
        int [] cprofit = profits.clone();
        printArray(cprofit);

        // Arrays class
        int i = Arrays.mismatch(dayProfit, weekendProfilt);
        if(i > 0)
            System.out.printf("%s %d %d%n", "Mismatch", dayProfit[i], weekendProfilt[i]);
        else
            System.out.println("No Mismatch");

        // fill array
         int[] dval = new int[20];
         Arrays.fill(dval, 7);
         printArray(dval);

        // fill array
         int[] rval = new int[100];
         Arrays.setAll(rval, e -> (int) (Math.random() * 10000));
         printArray(rval);

         // sort an array
         Arrays.sort(rval);
         printArray(rval);

        // faster sort on multiple cpu machines
        // new in jdk 8
         Arrays.parallelSort(rval);
         Arrays.stream(rval).filter(e -> e % 2 != 0).forEach(v ->  { System.out.print(v + " ");});

        // util methods to generage steam of fixed length
         IntStream.range(1, 100).forEach(System.out::println);
        
        // util methods to generage steam of infi steam
        // IntStream.generate(() -> (int)(Math.random() * 1000)).forEach(System.out::println);
    }

    private static void printArray(int[] array) {
        System.out.printf("%s%n", Arrays.toString(array));
    }
}