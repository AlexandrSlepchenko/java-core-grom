package lesson3.HW;

public class FindOdd {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 2 != 0) {
                System.out.println("Found");
                sum += i;
            }

        }
        if (sum * 5 > 5000) {
            System.out.println("Bigger");
        } else {
            System.out.println("Smaller or equal");
        }

        int a = 0;
        int sum1 = 0;
        while (a < 1000) {
            a++;
            if (a % 2 == 0) {
            } else {
                System.out.println("Found");
                sum1 += a;
            }
        }
        if (sum1 * 5 > 5000) {
            System.out.println("Bigger");
        } else {
            System.out.println("Smaller or equal");
        }
    }
}
