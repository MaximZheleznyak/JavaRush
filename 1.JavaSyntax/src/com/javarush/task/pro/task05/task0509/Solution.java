package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE = new int[10][10];


    public static void main(String[] args) {
        //напишите тут ваш код

    int array [] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int array2[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                MULTIPLICATION_TABLE [i][j] = array[i] * array2[j];
//

            }

        }

//        for (int i = 1; i < 10; i++) {
//
//            MULTIPLICATION_TABLE[i][0] = i;
//
//        }
//
//        for (int i = 1; i < 10; i++) {
//
//            MULTIPLICATION_TABLE[0][i] = i;
//
//        }
//
//
//        for (int i = 1; i < 10; i++) {
//
//            for (int j = 1; j < 10; j++) {
//
//                MULTIPLICATION_TABLE[i][j] = i * j;
//
//
//            }

///        }


        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
//
            }
//
            System.out.println();
//
        }

    }

}


