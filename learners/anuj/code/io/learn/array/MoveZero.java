package io.learn.array;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] amount = {1,2,4,0,8,9,0,4,5,0};
        System.out.println(Arrays.toString(amount));
        int[] amount_answer = {1,2,4,8,9,4,5,0,0,0};
        System.out.println(Arrays.toString(amount_answer));
    }
}
