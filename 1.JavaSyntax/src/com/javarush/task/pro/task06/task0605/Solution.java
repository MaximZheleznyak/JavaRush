package com.javarush.task.pro.task06.task0605;

/* 
Правильный порядок
*/

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {

        int z = array.length;
        int[] array2 = Arrays.copyOf(array, z);


//        array2[0] = array[z-1];
//        array2[1] = array[z-2];
//        array2[2] = array[z-3];
//        array2[3] = array[z-4];
//        array2[4] = array[z-5];
//        array2[5] = array[z-6];
//        array2[6] = array[z-7];
//        array2[7] = array[z-8];
//        array2[8] = array[z-9];
//        array2[9] = array[z-10];


        for (int i = 0; i < z; i++) {
            array2[i] = array[z-(i+1)];
        }
        for (int i = 0; i < z; i++) {
            array[i] = array2[i];
        }


//        String str = Arrays.toString(array);
//        String str2 = Arrays.toString(array2);
//
//        System.out.println(str);
//        System.out.println(str2);




    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
