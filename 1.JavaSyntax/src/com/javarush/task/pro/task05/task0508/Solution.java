package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код

        Scanner console = new Scanner(System.in); // создали переменные
        strings = new String[6];
        String[] test = new String[6];

        for (int i = 0; i < 6; i++) { // заполнили массив
            String str = console.nextLine();
            strings[i] = str;
        }

        for (int i = 0; i < 6; i++) { // копия
               test[i] = strings[i];
        }

        // сравнение


        for (int i = 0; i < strings.length; i++) {
            for (int j = i+1; j < strings.length ; j++) {
                if (test[i].equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;

                }
                }
            }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }

    }
}







