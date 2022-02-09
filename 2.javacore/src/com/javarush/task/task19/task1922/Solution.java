package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename = bufferedReader.readLine();
        bufferedReader.close();
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(filename));

        while (bufferedReader1.ready()){
            int counter = 0;
            ArrayList<Object> list = new ArrayList<>(); //новый arraylist
            String line = bufferedReader1.readLine();
            String [] test = line.split(" ");//получили массив слов

            for (String s : test) {
                Collections.addAll(list, s); //все слова строки в arraylist
            }

            for (String word : words) {
                counter += Collections.frequency(list, word);
            }

            if (counter == 2){
                System.out.println(line);
            }
        }
        bufferedReader1.close();
    }
}
