package com.tms.home_work_9.task1;

/**
 * В тексте находит самое длинное и самое короткое слово. Текст не содержит знаков препинания,
 * тк не удалось их включить в split()
 */
public class HM9Task1LengthOfWords {

    public static void main(String[] args) {

        String lineOfText = "За окном была прекрасная погода что редко случалось в последний месяц осени";
        System.out.println("Исходный текст: " + lineOfText);
        String[] linePart = lineOfText.split(" ");
        String maxWord = linePart[0];
        String minWord = linePart[0];

        for (int i = 1; i <= linePart.length-1; i++){
            if (maxWord.length() <= linePart[i].length()){
                maxWord = linePart[i];
            }

            if(minWord.length() >= linePart[i].length()){
                minWord = linePart[i];
            }
        }
        System.out.println("самое длинное слово - " + maxWord);
        System.out.println("самое короткое слово - " + minWord);
    }

}
