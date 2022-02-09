package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {

       String[] arrOfStr;
       TreeMap<String, Double> map = new TreeMap<>();
       FileReader fr = new FileReader(args[0]);
       BufferedReader br = new BufferedReader(fr);

       while (br.ready()) {
           String str = br.readLine();
           arrOfStr = str.split(" ");

           if (!map.containsKey(arrOfStr[0])) {
               map.put(arrOfStr[0], Double.parseDouble(arrOfStr[1]));
           } else if (map.containsKey(arrOfStr[0])) {
               map.merge(arrOfStr[0], Double.parseDouble(arrOfStr[1]), Double::sum);
           }
       }

        for (Object key : map.keySet()) {
            System.out.println(key + " " +map.get(key));
        }
        fr.close();
    }
 }


