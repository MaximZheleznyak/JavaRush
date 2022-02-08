package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двухмерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in); //
        int q = console.nextInt();
        multiArray = new int[q][];
        for (int i = 0; i < q ; i++) {
            int n = console.nextInt();
            multiArray[i] = new int [n];
        }
    }
}
