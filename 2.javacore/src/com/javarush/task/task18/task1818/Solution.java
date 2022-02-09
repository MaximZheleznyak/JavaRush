package com.javarush.task.task18.task1818;

import java.io.*;
import java.util.ArrayList;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        String file3 = bufferedReader.readLine();

        bufferedReader.close();

        BufferedReader bufferedFileReader1 = new BufferedReader(new FileReader(file2));

        while (bufferedFileReader1.ready()){
            list1.add(bufferedFileReader1.readLine());

        }

        bufferedFileReader1.close();

        BufferedReader bufferedFileReader2 = new BufferedReader(new FileReader(file3));

        while (bufferedFileReader2.ready()){
            list2.add(bufferedFileReader2.readLine());

        }

        bufferedFileReader2.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));

        for (Object x: list1
             ) {
            bufferedWriter.write(x.toString());
        }

        for (Object x: list2
        ) {
            bufferedWriter.write(x.toString());
        }

        bufferedWriter.close();
    }
}
