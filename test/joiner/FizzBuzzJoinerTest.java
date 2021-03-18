package joiner;

import com.company.joiner.FizzBuzzJoiner;
import com.company.joiner.Joiner;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FizzBuzzJoinerTest {

    Joiner<Collection<String>, String> fizzBuzzJoiner = new FizzBuzzJoiner();

    @Test
    public void joinZeroElementsTest(){
        String expected = "";
        String actual = fizzBuzzJoiner.join(Collections.EMPTY_LIST);
        assertEquals(expected, actual);
    }

    @Test
    public void joinOneElementTest(){
        String expected = "1";
        String actual = fizzBuzzJoiner.join(List.of("1"));
        assertEquals(expected, actual);
    }

    @Test
    public void joinTwoElementsTest(){
        String expected = "12";
        String actual = fizzBuzzJoiner.join(List.of("1","2"));
        assertEquals(expected, actual);
    }

    @Test
    public void joinFiveElementsTest(){
        String expected = "12Fizz4Buzz";
        String actual = fizzBuzzJoiner.join(List.of("1","2","Fizz","4","Buzz"));
        assertEquals(expected, actual);
    }

}
