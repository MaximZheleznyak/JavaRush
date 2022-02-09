package com.javarush.task.task19.task1915;


import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename = bufferedReader.readLine(); //чтение имени файла
        bufferedReader.close(); //закрытие потока

        PrintStream printStream = System.out; //сохраняем старый вывод

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); // массив байт
        PrintStream stream = new PrintStream(byteArrayOutputStream); //поток к массиву байт
        FileOutputStream fileOutputStream = new FileOutputStream(filename);//поток записи в файл

        System.setOut(stream); //новый поток в массив байт
        testString.printSomething();//заполняем массив

        fileOutputStream.write(byteArrayOutputStream.toByteArray()); //запись в файл
        fileOutputStream.close(); //закртытие потока записи

        System.setOut(printStream); //возврат старого потока вывода
        System.out.println(byteArrayOutputStream);// печать массива в консоль
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

