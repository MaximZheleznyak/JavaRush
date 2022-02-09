package com.javarush.task.task18.task1805;


import java.io.FileInputStream;

import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        HashSet<Integer> set = new HashSet<>();
        ArrayList array = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        String console = scanner.nextLine();

        FileInputStream fis = new FileInputStream(console);
        while (fis.available() > 0) {
            int current = fis.read();
            if (!set.contains(current)){
                set.add(current);
            }
        }

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            array.add(iterator.next());
        }
        Collections.sort(array);

        for (int i = 0; i < array.size(); i++) {

            System.out.print(array.get(i) + " ");
        }
        fis.close();
    }
}
