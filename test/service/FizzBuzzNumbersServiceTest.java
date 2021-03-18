package service;

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
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Objects;

import static org.junit.Assert.assertEquals;

public class FizzBuzzNumbersServiceTest {

    FizzBuzzNumbersService fizzBuzzNumbersService;

    @Before
    public void setUp(){
        NumberGenerator<Integer> fizzBuzzNumbersGenerator = new IntegerGenerator();
        Converter<Integer, String> fizzBuzzConverter = new NumberToFizzBuzzConverter();
        Joiner<Collection<String>, String> fizzBuzzJoiner = new FizzBuzzJoiner();
        Printer fizzBuzzPrinter = new FizzBuzzPrinter();
        fizzBuzzNumbersService =
                new FizzBuzzNumbersServiceImpl(fizzBuzzNumbersGenerator, fizzBuzzConverter, fizzBuzzJoiner, fizzBuzzPrinter);
    }

    @Test
    public void fizzBuzzNumbersServiceOneToFive(){
        String expected = "12Fizz4Buzz";
        String actual = fizzBuzzNumbersService.generateFizzBuzzNumbersString(1, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void fizzBuzzNumbersServiceOneToTen(){
        String expected = "12Fizz4BuzzFizz78FizzBuzz";
        String actual = fizzBuzzNumbersService.generateFizzBuzzNumbersString(1, 10);
        assertEquals(expected, actual);
    }

    public String getFirstOneHundredFizzBuzzNumbersStringFromFile() throws IOException {
        Path fizzBuzz100NumbersFilePath = Paths.get("resources/FizzBuzz100.txt");
        String content = new String (Files.readAllBytes( fizzBuzz100NumbersFilePath ));
        //Remove new lines et spaces caracter from file content
        return Objects.requireNonNull(content).replaceAll("\\s", "");
    }

    @Test
    public void fizzBuzzNumbersServiceOneToOneHundred() throws IOException {
        String expected = getFirstOneHundredFizzBuzzNumbersStringFromFile();
        String actual = fizzBuzzNumbersService.generateFizzBuzzNumbersString(1, 100);
        assertEquals(expected, actual);
    }



}
