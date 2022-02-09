package com.javarush.task.task18.task1816;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        int counter = 0;

        FileReader fr = new FileReader(args[0]);

        while (fr.ready()){
            int test = fr.read();
            if ((('a' <= test && test <= 'z') || ('A' <= test && test <= 'Z'))){

                counter++;


            }


        }


        System.out.println(counter);

        fr.close();

    }
}
