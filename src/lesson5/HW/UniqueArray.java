package lesson5.HW;

import java.util.Arrays;

public class UniqueArray {
    public static void main(String[] args) {
        int[] taskArray = {11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11};

        System.out.println(uniqueCount(taskArray));
    }

    static int uniqueCount(int[] array) {
        int count = 1;
        Arrays.sort(array);

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] != array[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public static int uniqueCount2(int[]array){
        int [] copy = new int[array.length];
        int res = 0;
        int countNum = 0;
        int count = 0;

        for (int i = 0; i < copy.length; i++) {
            copy[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            if (copy[i] == 0) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        copy[j] = 1;
                        count++;
                    }
                }
            }
            if (countNum < count) {
                countNum = count;
                res++;
            }
        }
        return res;
    }
}
