package com.javarush.task.task18.task1817;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        int spaces = 0;
        int chars = 0;



        FileReader fr = new FileReader(args[0]);

        while (fr.ready()) {
            if (fr.read() == 32){
                spaces++;

            } else {
                chars++;
            }
                }

//        System.out.println(spaces);
//        System.out.println(chars);

//        result = (double) (spaces + chars)/spaces;



        double result = (double) spaces/(spaces + chars)*100;

        System.out.println(String.format("%.2f", result));

        fr.close();

    }
}
