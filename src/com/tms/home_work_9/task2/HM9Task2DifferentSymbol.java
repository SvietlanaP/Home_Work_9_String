package com.tms.home_work_9.task2;

/**
 * Ищется слово с минимальным количеством разных символов
 */
public class HM9Task2DifferentSymbol {

    public static void main(String[] args) {

        String lineOfText = "За окном была прекрасная погода что ред5ко случалос556ь в84 последний месяц осени";
        System.out.println("Исходный текст: " + lineOfText);

        String[] linePart = lineOfText.split(" ");
        String word = linePart[0];
        int countPrevious = DifferentLetterCount(word);

        for (int i = 1; i <= linePart.length-1; i++){
            int countNext = DifferentLetterCount(linePart[i]);
            if (countPrevious > countNext){
                word = linePart[i];
            }
        }
        System.out.println("Наименьшее количество разных символов в слове " + word);

    }
    //считает количество различных символов в слове
    public static int DifferentLetterCount(String linePart){
        int countPrevious = linePart.length();
        for(int i = 0; i < linePart.length()-1; i++){
            char[] str = linePart.toCharArray();
            for (int j = i + 1; j < linePart.length(); j++){
                if (str[i] == str[j]){
                    countPrevious--;
                    break;
                }
            }
        }
        return countPrevious;
    }

}
