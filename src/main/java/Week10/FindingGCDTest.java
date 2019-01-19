package Week10;

import java.math.BigInteger;

public class FindingGCDTest {
    public static void main(String[] args) {
        FindingGCDTest gcdTest = new FindingGCDTest();
        gcdTest.findingGCD();
    }

    public int findingGCD() {
        BigInteger[] numArray = {new BigInteger("15"), new BigInteger("20"), new BigInteger("45"), new BigInteger("55")};

        BigInteger bigInteger;
        bigInteger = numArray[0].gcd(numArray[1]).gcd(numArray[2]).gcd(numArray[3]);
        int limit = bigInteger.intValue();
        System.out.println("The Common Factor of the Numbers : " + limit);

        return limit;

    }
}
