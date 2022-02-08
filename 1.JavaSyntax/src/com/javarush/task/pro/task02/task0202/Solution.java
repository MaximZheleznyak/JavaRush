package com.javarush.task.pro.task02.task0202;

/* 
Полнометражная картина
*/

public class Solution {

    public static void main(String[] args) {

            int x = 0;
            int c = 0;
            int sum = 0;

//        int z = x % y;

        while (c < 100){

           c++;

            if ((c % 3) == 0) {
                continue;
            }
            else {
                sum = sum + c;
            }

            //          System.out.println(c);
            System.out.println(sum);

        }

//       System.out.println(sum);







    }
}