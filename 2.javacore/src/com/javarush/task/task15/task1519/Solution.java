package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
            String line = br.readLine();

            try {
            if (line.equals("exit")){
                break;
            }
            else if (line.contains(".")) {
                double value = Double.parseDouble(line);
                print(value);
                continue;
            } else if (Integer.parseInt(line) < 128 && Integer.parseInt(line) > 0) {
                short value = Short.parseShort(line);
                print(value);
                continue;
            } else if (Integer.parseInt(line) <= 0 || Integer.parseInt(line) >= 128) {
                Integer value = Integer.parseInt(line);
                print(value);
                continue;
            } }
        catch (Exception e){
           print(line);
        }
        }
        br.close();
    }




    public static void print(Double value) {
        System.out.println("" +
                "Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println(
                "Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("" +
                "Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println(
                "Это тип Integer, значение " + value);
    }
}
