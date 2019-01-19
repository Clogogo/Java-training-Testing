package Week10;

public class BasicCalculator {
    public int sumCalculator(){
        int result = 2+3;
        System.out.println(result);
        return result;
    }
    public int mulitplyCalculator(){
        int result = 2*3;
        System.out.println(result);
        return result;
    }

    public double divideCalculator() {
        double result = 2 / 3;
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculator();
        basicCalculator.sumCalculator();
        basicCalculator.mulitplyCalculator();
        basicCalculator.divideCalculator();
    }
}
 ;