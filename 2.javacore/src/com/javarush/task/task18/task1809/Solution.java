package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList array = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        String readFile = scanner.nextLine();
        String writeFile = scanner.nextLine();


        FileInputStream fis = new FileInputStream(readFile);


        while (fis.available() > 0){
            array.add(fis.read());
        }

        Collections.reverse(array);

        FileOutputStream fos = new FileOutputStream(writeFile);

        for (int i = 0; i < array.size(); i++) {

            fos.write((Integer) array.get(i));
        }

        fis.close();
        fos.close();



    }
}
