package com.javarush.task.task18.task1822;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        String console = scanner.nextLine();

        FileReader fr = new FileReader("C:\\temp\\log1.txt");
        BufferedReader br = new BufferedReader(fr);

        ArrayList list = new ArrayList();


        while (br.ready()){

            list.add(br.readLine());

        }


        System.out.println(list.size());
    }
    }



