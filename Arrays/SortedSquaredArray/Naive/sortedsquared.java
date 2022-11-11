package SortedSquaredArray.Naive;

import java.util.Arrays;

public class sortedsquared {
    public static int[] sortedsquared(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 5, 6, 8, 9 };
        System.out.println(sortedsquared(array));
    }
}
