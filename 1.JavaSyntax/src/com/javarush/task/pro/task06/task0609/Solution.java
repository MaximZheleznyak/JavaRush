package com.javarush.task.pro.task06.task0609;

/* 
Кубический калькулятор в кубе
*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        long a = console.nextLong();
        ninthDegree(a);
        System.out.println(ninthDegree(a));
    }

    public static long ninthDegree(long a){
        return cube(cube(cube(a)));

    }

    public static long cube(long a) {
        return a * a * a;
    }

}
