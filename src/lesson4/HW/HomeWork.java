package lesson4.HW;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(sum(1, 10));
    }

    public String concat(String a, String b, String c) {
        return a + b + c;
    }

    public int findDivCount(short a, short b, int n) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % n == 0)
                count++;
        }
        return count;
    }

    public static boolean compareSums(int a, int b, int c, int d) {
        return sum(a, b) > sum(c, d);
    }

    private static long sum(int from, int to) {
        long sum = 0;
        while (to >= from) {
            sum += to;
            to--;
        }
        return sum;
    }
}
