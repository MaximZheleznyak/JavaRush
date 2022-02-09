package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.ArrayList;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        bufferedReader.close();

        ArrayList <Double> list = new ArrayList<>();
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1));
        String [] array = bufferedReader1.readLine().split(" ");
        bufferedReader1.close();

        for (String s : array) {
            list.add(Double.parseDouble(s));
        }

        FileWriter fileWriter = new FileWriter(file2);

        for (Double aDouble : list) {
            double value = aDouble;
            int result = (int) Math.round(value);
            fileWriter.write((result) + " ");
        }

        fileWriter.close();
    }
}
