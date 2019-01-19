package Week10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicCalculatorTest {
    @Test
    public void shouldReturnCorrectResultWhenSumupTwoNumbers() {
        //given
        BasicCalculator basicCalculator = new BasicCalculator();
        int expectedResult = 5;
        //when
        int actualResult = basicCalculator.sumCalculator();
        //then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnCorrectResultWhenMultiplyupTwoNumbers2() {
        //given
        BasicCalculator basicCalculator = new BasicCalculator();
        int expectedResult = 6;
        //when
        int actualResult = basicCalculator.mulitplyCalculator();
        //then
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldReturnCorrectResultWhenDivisionupTwoNumbers3() {
        //given
        BasicCalculator basicCalculator = new BasicCalculator();
        double expectedResult = 0.25;
        //when
        double actualResult = basicCalculator.divideCalculator();
        //then
        assertEquals(5, 3,2);
    }
}
