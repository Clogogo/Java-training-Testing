package Week10;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class FindingGCDTestTest {
@Test
    public void testFindingGCD() {
        //given
        FindingGCDTest gcdTest = new FindingGCDTest();
        int expectedResult = 5;
        //when
        int actualResult = gcdTest.findingGCD();
        //then
   assertEquals(expectedResult, actualResult);


    }

}