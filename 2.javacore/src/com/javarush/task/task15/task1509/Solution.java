package com.javarush.task.task15.task1509;

/* 
Мужчина или женщина?
*/

public class Solution {
    public static void main(String[] args) {
        Human human = new Human();
        Human human1 = new Human();

        printName(human);
        printName(human1);
    }

    public static void printName(Human human) {

    }

    public static class Human {

    }

    public static class Man extends Human{

    }

    public static class Woman extends Human {

    }
}
