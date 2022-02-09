package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream printStream = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(byteArrayOutputStream);

        System.setOut(stream);

        testString.printSomething();

        String[] result = byteArrayOutputStream.toString().split(" ");

        int a = Integer.parseInt(result[0]);
        int b = Integer.parseInt(result[2]);

        System.setOut(printStream);

        if (result[1].equals("+")){

            System.out.println(result[0]+ " " + result[1]+ " " + result[2] + " = "+ (a + b));
        } else if (result[1].equals("*")) {
            System.out.println(result[0]+ " " + result[1]+ " " + result[2] + " = "+ (a * b));
        } else if (result[1].equals("-")){
            System.out.println(result[0]+ " " + result[1]+ " " + result[2] + " = "+ (a - b));
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

