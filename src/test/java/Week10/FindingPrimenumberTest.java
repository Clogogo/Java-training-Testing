package Week10;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindingPrimenumberTest {
    @Test
    public void testForPrimeNumber(){
        //given
        FindingPrimenumber primenumber = new FindingPrimenumber();
        int resultExpected = 4;
        //When
        int actualResult = primenumber.isPrime(15);
        //then
        assertEquals(resultExpected, primenumber);

    }


}