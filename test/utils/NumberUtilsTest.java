package utils;

import com.company.utils.NumberUtils;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberUtilsTest {

    @Test
    public void threeContainsThreeTest(){
        assertTrue(NumberUtils.cointainsDigit(3, 3));
    }

    @Test
    public void thirteenContainsThreeTest(){
        assertTrue(NumberUtils.cointainsDigit(13, 3));
    }

    @Test
    public void thirteenNotContainsTwoTest(){
        assertFalse(NumberUtils.cointainsDigit(13, 2));
    }

    @Test
    public void fiftyTwoContainsFiveTest(){
        assertTrue(NumberUtils.cointainsDigit(52, 5));
    }

    @Test
    public void fiftyTwoNotContainsThreeTest(){
        assertFalse(NumberUtils.cointainsDigit(52, 3));
    }

    @Test
    public void tenContainsZeroTest(){
        assertTrue(NumberUtils.cointainsDigit(10, 0));
    }

    @Test
    public void thirtyNineContainsNineTest(){
        assertTrue(NumberUtils.cointainsDigit(39, 9));
    }

    @Test(expected = IllegalArgumentException.class)
    public void digitLessThanZeroTest() {
        NumberUtils.cointainsDigit(10, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void digitMoreThanNineTest() {
        NumberUtils.cointainsDigit(10, 10);
    }

}
