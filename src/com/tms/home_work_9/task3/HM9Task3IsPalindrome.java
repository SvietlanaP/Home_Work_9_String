package com.tms.home_work_9.task3;

import java.util.Scanner;

/**
 * Проверяет является ли выбранное число полиндромом
 */
public class HM9Task3IsPalindrome {

    public static void main(String[] args) {

        String lineOfText = "шалаш cfkfb салат миг дом доход";
        System.out.println("Исходный текст: " + lineOfText);
        String[] linePart = lineOfText.split(" ");

        //спрашиваем, какое число проверить
        Scanner in = new Scanner(System.in);
        System.out.println("Какое по счету число проверить?");
        int wordsNum = in.nextInt();

        while (wordsNum > linePart.length || wordsNum < 1){
            System.out.println("Введенное число должно быть положительным и не больше " + linePart.length +
                    ". Порообуйте еще.");
            Scanner in2 = new Scanner(System.in);
            System.out.println("Какое по счету число проверить?");
            wordsNum = in2.nextInt();
        }

        //проверяем выбранное число
        StringBuilder isPalindr = new StringBuilder(linePart[wordsNum-1]);
        if(isPalindr.toString().equals(isPalindr.reverse().toString())){
            System.out.println(linePart[wordsNum-1] + " - полиндром");
        } else {
            System.out.println(linePart[wordsNum-1] + " - не полиндром");
        }


    }
}
