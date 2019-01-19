package Week10;

import org.junit.Test;

public class FindingArrayTest {
    @Test(expected = ArrayIndexOutOfBoundsException.class)

    public void FindingArrayTesting() {

        FindingArray array = new FindingArray();
        //given
        int[] arrNumber = {1, 5, 8, 4};
        int index = 4;

        array.FindingArray();

    }

}