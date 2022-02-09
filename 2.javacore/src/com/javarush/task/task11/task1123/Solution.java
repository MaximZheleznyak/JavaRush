package com.javarush.task.task11.task1123;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {


            return new Pair(null, null);
        } else {

            ArrayList<Integer> result = new ArrayList();

            for (int i = 0; i < inputArray.length ; i++) {
                result.add(inputArray[i]);
            }

            int min = Collections.min(result);
            int max = Collections.max(result);

            return new Pair(min, max);



        }

    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}
