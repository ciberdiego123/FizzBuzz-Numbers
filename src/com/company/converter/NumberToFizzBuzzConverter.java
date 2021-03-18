package com.company.converter;

import com.company.constants.StringConstants;
import com.company.utils.NumberUtils;

public class NumberToFizzBuzzConverter implements Converter<Integer, String>{

    @Override
    public String convert(Integer number) {
        boolean isFizz = (number % 3 == 0) || NumberUtils.cointainsDigit(number, 3);
        boolean isBuzz = (number % 5 == 0) || NumberUtils.cointainsDigit(number, 5);
        if(isFizz && isBuzz)
            return StringConstants.FIZZBUZZ;
        else if(isFizz)
            return "Fizz";
        else if(isBuzz)
            return "Buzz";
        else
            return String.valueOf(number);
    }
}
