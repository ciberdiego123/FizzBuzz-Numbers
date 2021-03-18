package generator;

import com.company.generator.IntegerGenerator;
import com.company.generator.NumberGenerator;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class IntegerGeneratorTest {

    NumberGenerator<Integer> fizzBuzzNumbersGenerator = new IntegerGenerator();

    @Test
    public void oneToFiveTest(){
        List<Integer> expected = List.of(1,2,3,4,5);
        List<Integer> actual = (List<Integer>)
                fizzBuzzNumbersGenerator.generate(1, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void oneToTenTest(){
        List<Integer> expected = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> actual = (List<Integer>)
                fizzBuzzNumbersGenerator.generate(1, 10);
        assertEquals(expected, actual);
    }

    @Test
    public void oneToOneHundredTest(){
        int expectedSize = 100;
        Integer expectedFirstItem = 1;
        Integer expectedLastItem = 100;
        List<Integer> actual = (List<Integer>)
                fizzBuzzNumbersGenerator.generate(1, 100);
        assertEquals(expectedSize, actual.size());
        assertEquals(expectedFirstItem, actual.get(0));
        assertEquals(expectedLastItem, actual.get(expectedSize - 1));
    }


}
