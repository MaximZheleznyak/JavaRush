package com.javarush.task.task18.task1804;

import java.io.FileInputStream;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {




//    static HashMap<ArrayList, Integer> map = new HashMap<ArrayList, Integer>();


    public static void main(String[] args) throws Exception {
        ArrayList list = new ArrayList();

        HashMap <Integer, Integer> map = new HashMap<>();
        int minFreq = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);
        String console = scanner.nextLine();
        FileInputStream fis = new FileInputStream(console);

        while(fis.available() > 0) {
            list.add(fis.read());
        }

        for (int i = 0; i < list.size(); i++) {
            if (Collections.frequency(list, list.get(i))< minFreq){
                minFreq = Collections.frequency(list, list.get(i));
            }

           map.put((int) list.get(i),Collections.frequency(list, list.get(i)));

        }
        for (Integer key: map.keySet())
        {
            Integer value = map.get(key);

            if (value == minFreq){
                System.out.print(key + " ");
            }
        }
            fis.close();

            }
        }
