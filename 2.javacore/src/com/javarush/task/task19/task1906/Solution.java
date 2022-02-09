package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = bufferedReader.readLine();
            fileName2 = bufferedReader.readLine();
        }

        FileReader fr = new FileReader(fileName1);
        FileWriter fw = new FileWriter(fileName2);

        ArrayList list = new ArrayList();

        while (fr.ready()){
            list.add(fr.read());
        }
        fr.close();
            for (int i = 1; i < list.size(); i = i + 2) {
                fw.write((byte) (int) list.get(i));
            }

        fw.close();

    }
}
