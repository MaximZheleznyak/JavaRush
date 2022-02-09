package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String console = scanner.nextLine();

        byte[] min = new byte[255];

        FileInputStream inputStream = new FileInputStream(console);

        while (inputStream.available() > 0){
            int read = inputStream.read();
            min[read]++;


        }

        for (int i = 0; i < min.length; i++) {
            if (min[i] > 2) System.out.print(i + " ");

        }




       inputStream.close();

    }

}