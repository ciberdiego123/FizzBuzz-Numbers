package com.company;

import com.company.converter.Converter;
import com.company.converter.NumberToFizzBuzzConverter;
import com.company.generator.IntegerGenerator;
import com.company.generator.NumberGenerator;
import com.company.joiner.FizzBuzzJoiner;
import com.company.joiner.Joiner;
import com.company.printer.FizzBuzzPrinter;
import com.company.printer.Printer;
import com.company.service.FizzBuzzNumbersService;
import com.company.service.FizzBuzzNumbersServiceImpl;

import java.util.Collection;

public class FizzBuzzNumbersApplication {

    static FizzBuzzNumbersService fizzBuzzNumbersService;

    public static void initializeApplication(){
        NumberGenerator<Integer> fizzBuzzNumbersGenerator = new IntegerGenerator();
        Converter<Integer, String> fizzBuzzConverter = new NumberToFizzBuzzConverter();
        Joiner<Collection<String>, String> fizzBuzzJoiner = new FizzBuzzJoiner();
        Printer fizzBuzzPrinter = new FizzBuzzPrinter();
        fizzBuzzNumbersService =
                new FizzBuzzNumbersServiceImpl(fizzBuzzNumbersGenerator, fizzBuzzConverter, fizzBuzzJoiner, fizzBuzzPrinter);
    }

    public static void main(String[] args) {
	    initializeApplication();
	    fizzBuzzNumbersService.showFizzBuzzNumbers(1, 100);
    }
}
