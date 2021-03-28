package com.sda.strings;

import java.util.Locale;

public class UpperCase implements StringOperation {

    @Override
    public String modify(String text) {
        return text.toUpperCase();
    }

}
