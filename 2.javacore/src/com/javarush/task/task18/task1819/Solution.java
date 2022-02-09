package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();

        FileInputStream fis1 = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);

        byte [] array = new byte[fis1.available()];
        byte [] array2 = new byte[fis2.available()];

        for (int i = 0; i < array.length; i++) {
            array[i] = (byte) fis1.read();
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (byte) fis2.read();
        }
            fis1.close();
            fis2.close();

        ArrayList<byte[]> result = new ArrayList();

        result.add(array2);
        result.add(array);

        FileOutputStream fos = new FileOutputStream(file1);

        for (int i = 0; i < result.size() ; i++) {

            fos.write(result.get(i));
        }

        fos.close();
   }
}
