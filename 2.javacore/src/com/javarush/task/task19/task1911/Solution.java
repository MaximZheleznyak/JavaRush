package com.javarush.task.task19.task1911;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

/* 
Ридер обертка
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consoleStream = System.out; //Запомнили поток

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); //инициализация массива

        PrintStream stream = new PrintStream(outputStream);//поток печати байтов в массив

        System.setOut(stream);//Устанавливаем поток вместо вывода в консоль

        testString.printSomething();

        String result = outputStream.toString().toUpperCase();//перехватываем байты (те что для System.out) + новая переменная с заглавными

        System.setOut(consoleStream);//возвращаем как было

        System.out.println(result);//печать переменной, вывод на консоль

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
