package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        long x = console.nextLong();
        cube(x);
        System.out.println(cube(x));

    }

    public static long cube(long x){
        x = x*x*x;
        return x;
    }



    //напишите тут ваш код
}
