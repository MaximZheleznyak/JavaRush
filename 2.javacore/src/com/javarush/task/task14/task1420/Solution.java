package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int console = scanner.nextInt();
        int console2 = scanner.nextInt();

        int delimer = 1;

        for (int i = 1; i <= console; i++) {

            if (console % i == 0 && console2 % i == 0){
                delimer=i;
            }

        }


        System.out.println(delimer);
    }
}
