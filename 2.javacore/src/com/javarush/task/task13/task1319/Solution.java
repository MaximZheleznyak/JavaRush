package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        // напишите тут ваш код


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь: ");
        String path = scanner.nextLine();

        File file = new File(path);
        PrintWriter pw = new PrintWriter(file);



        do {


         pw.println(System.in);


        } while (System.in.equals("exit"));





        pw.close();
    }
}
