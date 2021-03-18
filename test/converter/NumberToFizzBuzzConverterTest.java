package converter;

import com.company.constants.StringConstants;
import com.company.converter.Converter;
import com.company.converter.NumberToFizzBuzzConverter;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NumberToFizzBuzzConverterTest {

    Converter<Integer, String> fizzBuzzConverter = new NumberToFizzBuzzConverter();

    @Test
    public void convertOneTest() {
        String expected = "1";
        String actual = fizzBuzzConverter.convert(1);
        assertEquals(expected, actual);
    }

    @Test
    public void convertTwoTest() {
        String expected = "2";
        String actual = fizzBuzzConverter.convert(2);
        assertEquals(expected, actual);
    }


    @Test
    public void convertThreeTest() {
        String expected = StringConstants.FIZZ;
        String actual = fizzBuzzConverter.convert(3);
        assertEquals(expected, actual);
    }

    @Test
    public void convertFiveTest() {
        String expected = StringConstants.BUZZ;
        String actual = fizzBuzzConverter.convert(5);
        assertEquals(expected, actual);
    }

    @Test
    public void convertFifteenTest() {
        String expected = StringConstants.FIZZBUZZ;
        String actual = fizzBuzzConverter.convert(15);
        assertEquals(expected, actual);
    }

    @Test
    public void convertThirtyTest() {
        String expected = StringConstants.FIZZBUZZ;
        String actual = fizzBuzzConverter.convert(30);
        assertEquals(expected, actual);
    }

    @Test
    public void convertThirteenTest() {
        String expected = StringConstants.FIZZ;
        String actual = fizzBuzzConverter.convert(13);
        assertEquals(expected, actual);
    }

    @Test
    public void convertThirtyFiveTest() {
        String expected = StringConstants.FIZZBUZZ;
        String actual = fizzBuzzConverter.convert(35);
        assertEquals(expected, actual);
    }

    @Test
    public void convertFiftyTest() {
        String expected = StringConstants.BUZZ;
        String actual = fizzBuzzConverter.convert(50);
        assertEquals(expected, actual);
    }

    @Test
    public void convertFiftyOneTest() {
        String expected = StringConstants.FIZZBUZZ;
        String actual = fizzBuzzConverter.convert(51);
        assertEquals(expected, actual);
    }

    @Test
    public void convertFiftyTwoTest() {
        String expected = StringConstants.BUZZ;
        String actual = fizzBuzzConverter.convert(52);
        assertEquals(expected, actual);
    }

}
