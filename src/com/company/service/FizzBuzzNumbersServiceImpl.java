package com.company.service;

import com.company.converter.Converter;
import com.company.generator.NumberGenerator;
import com.company.joiner.Joiner;
import com.company.printer.Printer;
import java.util.Collection;
import java.util.stream.Collectors;

public class FizzBuzzNumbersServiceImpl implements FizzBuzzNumbersService {

    private final NumberGenerator<Integer> generator;

    private final Converter<Integer, String> converter;

    private final Joiner<Collection<String>, String> joiner;

    private final Printer printer;

    public FizzBuzzNumbersServiceImpl(NumberGenerator<Integer> generator, Converter<Integer, String> converter, Joiner<Collection<String>, String> joiner, Printer printer) {
        this.generator = generator;
        this.converter = converter;
        this.joiner = joiner;
        this.printer = printer;
    }

    @Override
    public String generateFizzBuzzNumbersString(int start, int end) {
        Collection<Integer> numbers = generator.generate(start, end);
        Collection<String> fizzNumbers = numbers.stream()
                .map(converter::convert)
                .collect(Collectors.toList());
        return joiner.join(fizzNumbers);
    }

    @Override
    public void showFizzBuzzNumbers(int start, int end) {
        String content = generateFizzBuzzNumbersString(start, end);
        printer.print(content);
    }
}
