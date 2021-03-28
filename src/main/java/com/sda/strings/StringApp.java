package com.sda.strings;

import java.util.ArrayList;
import java.util.List;

public class StringApp {

    public static void main(String[] args) {

        List<String> texts = new ArrayList<>();
        texts.add("Tekst 1");
        texts.add("Tekst 2");
        texts.add("Tekst 3");

        UpperCase upperCase = new UpperCase();

        //Interfejs implementowany klasą anonimową
        StringOperation duplicate = new StringOperation() {
            @Override
            public String modify(String text) {
                return text + " " + text;
            }
        };

        //Intefejs implementowany za pomocą lambdy w pełnej formie
        StringOperation removeLetterI = (String text) -> {
            return text.replace("i", "");
        };

        // Skrócona wersja - bez nawiasu, bo interfejs już mowi Javie, ze to String
        StringOperation shorten = text -> text.substring(0,3);

        // Inferfejs implementowany za pomocą refencji do metody
        StringOperation textToUpperCaseMethodReference = String::toUpperCase;

        for (String text : texts) {
            String modified = upperCase.modify(text);
            System.out.println(modified);
        }

        for (String text: texts) {
            String modified = duplicate.modify(text);
            System.out.println(modified);
        }

        for (String text: texts) {
            String modified = shorten.modify(text);
            System.out.println(modified);

    }
}
}

