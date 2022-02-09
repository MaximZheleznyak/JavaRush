package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> resultArray = new ArrayList<>();
        String[] block;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();

        bufferedReader.close();

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1));

        while (bufferedReader1.ready()) {
            String line = bufferedReader1.readLine();
            block = line.split(" ");
            list.addAll(Arrays.asList(block));
        }

        bufferedReader1.close();

        for (String value : list) {
            try {
                int x = Integer.parseInt(String.valueOf(value));
                resultArray.add(x);
            } catch (Exception e) {
                continue;
            }
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));

        for (Integer s: resultArray) {
            bufferedWriter.write(s + " ");
        }
        bufferedWriter.close();
    }
}