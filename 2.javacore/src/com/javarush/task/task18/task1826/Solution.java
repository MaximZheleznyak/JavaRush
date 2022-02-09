package com.javarush.task.task18.task1826;

import java.io.*;
import java.util.ArrayList;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList <Integer> list = new ArrayList<>();

        String fileInput = args[1];
        String fileOutput = args[2];


        if (args[0].equals("-e")){
            FileReader fileReader = new FileReader(fileInput);
            while (fileReader.ready()){
                list.add(fileReader.read()-1);
            }
                fileReader.close();

            FileWriter fileWriter = new FileWriter(fileOutput);
            for (Integer integer : list) {
                fileWriter.write(integer);
            }
                  fileWriter.close();

        } else if (args[0].equals("-d")){
            FileReader fileReader = new FileReader(fileInput);
            while (fileReader.ready()){
                list.add(fileReader.read()+1);
            }
            fileReader.close();

            FileWriter fileWriter = new FileWriter(fileOutput);
            for (Integer integer : list) {
                fileWriter.write(integer);

            }
            fileWriter.close();

        }
    }
}
