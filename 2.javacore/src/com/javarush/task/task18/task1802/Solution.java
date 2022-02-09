package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Integer current = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);
        String console = scanner.nextLine();

        FileInputStream inputStream = new FileInputStream(console);


        while (inputStream.available()>0){

            int check = inputStream.read();

            if (check < current) {
                current = check;
            }
        }
        inputStream.close();

        System.out.println(current);

    }

}
