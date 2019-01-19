package Week10;

public class FindingPrimenumber {
    public int isPrime(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }

        if (counter == 2) {
            System.out.println(counter);
        } else {
            System.out.println(counter);
        }
        return counter;
    }


    public static void main(String[] args) {
        FindingPrimenumber primenumber = new FindingPrimenumber();
        primenumber.isPrime(70000);
    }
}
