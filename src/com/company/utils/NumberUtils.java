package com.company.utils;

public class NumberUtils {

    public static boolean cointainsDigit(int number, int digit){
        if(digit < 0 || digit > 9)
            throw new IllegalArgumentException("A digit between 0 and 9 is required");
        String numberString = String.valueOf(number);
        String digitString = String.valueOf(digit);
        return numberString.contains(digitString);
    }

}
