package com.tms.home_work_9.task0;

/**
 * Программа показывает различные методы работы со строкой, которая является номером документа
 */

public class HM9Task0DocNumber extends HM9Task0MethodForDocNumber {

    public static void main(String[] args) {
        String docNumber = "5554-yRd-5412-ABC-1a2b";

        BlockNumber(docNumber);
        LetterChangingStar(docNumber);
        LetterFormatLower(docNumber);
        LetterFormatUpper(docNumber);
        SequenceToDocNumber(docNumber);
        DocStartingWithNumber(docNumber);
        DocFinishingWithNumber(docNumber);

    }
}
