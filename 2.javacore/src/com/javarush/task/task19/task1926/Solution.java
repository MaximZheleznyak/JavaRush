package com.javarush.task.task19.task1926;
import java.io.*;
/*
Перевертыши
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader bufferedReader1 = new BufferedReader( new FileReader(filename));

        while (bufferedReader1.ready()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(bufferedReader1.readLine());
            System.out.println(stringBuilder.reverse());
        }
    }
}