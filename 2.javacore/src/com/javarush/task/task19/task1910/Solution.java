package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList <String> list  = new ArrayList<>();

        String[] words;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();

        bufferedReader.close();

        BufferedReader bufferedFileReader = new BufferedReader(new FileReader(file1));

        while (bufferedFileReader.ready()){
            String line = bufferedFileReader.readLine().replaceAll("\\p{P}", "");

            words = line.split(" ");

            Collections.addAll(list, words);
        }

        bufferedFileReader.close();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
        for (String s: list
             ) {
            bufferedWriter.write(s+ " ");
        }
        bufferedWriter.close();
    }
}
