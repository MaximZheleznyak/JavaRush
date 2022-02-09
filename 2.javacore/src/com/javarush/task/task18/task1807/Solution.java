package com.javarush.task.task18.task1807;

import java.io.*;
import java.util.Scanner;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        String console = scanner.nextLine();

        FileInputStream fis = new FileInputStream(console);


        while (fis.available() > 0) {
            if (fis.read() == 44) {

                counter++;
            }
        }
            System.out.println(counter);



fis.close();




    }
}
