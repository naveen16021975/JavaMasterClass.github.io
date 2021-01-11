package io.learn.array;

public class ArrayArray {
    public static void main(String[] args) {

        // declares an array of integers
        int[] top2p;
        
        // create an array of integers
        top2p = new int[2];
        
        // array elements
        top2p[0] = 1_442_221_768; // china
        top2p[1] = 1_380_004_385; // india

        // change to long type to get correct result
        int totalp = 0;

        for(int i: top2p)
            totalp += i;

        System.out.printf("%s %d%n", "Max value of interger", Integer.MAX_VALUE);
        System.out.printf("%s %d%n", "Total Population", totalp);
    }
    
}
