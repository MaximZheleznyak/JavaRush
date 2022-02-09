package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList array = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();
        String file3 = scanner.nextLine();

        int size = 0;


        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos1 = new FileOutputStream(file2);
        FileOutputStream fos2 = new FileOutputStream(file3);


        while (fis.available() > 0){

            array.add(fis.read());

        }

if (array.size()%2 == 0){

    size = array.size()/2;

    for (int i = 0; i < size ; i++) {

        fos1.write((Integer) array.get(i));

    }

    for (int i = size; i < array.size(); i++) {
        fos2.write((Integer) array.get(i));

    }
} else {

    size = (array.size()/2)+1;

    for (int i = 0; i < size ; i++) {
        fos1.write((Integer) array.get(i));
    }

    for (int i = size; i < array.size() ; i++) {
        fos2.write((Integer) array.get(i));
    }
}

       fis.close();
       fos1.close();
       fos2.close();

    }
}
