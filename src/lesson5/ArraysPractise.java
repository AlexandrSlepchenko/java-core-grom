package lesson5;

public class ArraysPractise {
    public static void main(String[] args) {
        int[] array = {-10, 45, 1000, -5500, 10, 10, 10};
        System.out.println(maxElement(array));
        System.out.println(nCount(array,10));
    }

    public static int maxElement(int[] array) {
        int max = array[0];

        for (int el : array) {
            if (max < el)
                max = el;
        }
        return max;
    }

    public static int nCount(int[] array, int n) {
        int count = 0;

        for (int el:array){
            if (el == n)
                count++;
        }
        return count;
    }
}
