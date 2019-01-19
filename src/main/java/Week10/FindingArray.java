package Week10;

public class FindingArray {

    public int[] FindingArray() {
        int[] arrNumber = {1, 5, 8, 4};
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.println(arrNumber[i]);

        }
        return arrNumber;
    }

    public static void main(String[] args) {
        FindingArray array = new FindingArray();
        array.FindingArray();
    }

}

