package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();

        bufferedReader.close();

        BufferedReader fileBufferReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileBufferWriter = new BufferedWriter(new FileWriter(fileName2));

        ArrayList list = new ArrayList();

        while (fileBufferReader.ready()){
            list.add(fileBufferReader.read());
        }

      fileBufferReader.close();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(46)) {
                list.set(i, 33);
            }
        }

        for (int i = 0; i < list.size() ; i++) {
            fileBufferWriter.write((Integer) list.get(i));
        }

        fileBufferWriter.close();
    }
}

