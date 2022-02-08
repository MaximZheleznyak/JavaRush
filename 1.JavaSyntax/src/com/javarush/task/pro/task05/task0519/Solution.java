package com.javarush.task.pro.task05.task0519;

import java.util.Arrays;

/* 
Есть ли кто?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        //напишите тут ваш код

        int[] array2 = Arrays.copyOf(array, array.length); //копируем массив

        Arrays.sort(array2); //сортируем второй массив

        int index1 = Arrays.binarySearch(array2, element); // поиск переменной

//        System.out.println(index1);

        if (index1 >= 0){

            System.out.println(true);
        }
        else

            System.out.println(false);

    }
}
