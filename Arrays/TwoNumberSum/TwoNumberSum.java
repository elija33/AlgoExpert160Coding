package TwoNumberSum;

import java.util.Scanner;

public class TwoNumberSum{
    public static int[] twoNumberSum(int[] array, int targetSum){
        for(int i = 0; i<=array.length; i++){
            for(int j = i + 1; j<=array.length; j++){
                if(array[i] + array[j] == targetSum){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int numbers = number.nextInt();
        int[] array = new int[numbers];

        for(int i = 0; i < numbers; i++){
            array[i] = number.nextInt();
        }

        int targetSum = number.nextInt();

            number.close();

            int[] first = twoNumberSum(array, targetSum);

            if(first.length == 2) {
                System.out.println(first[0] + " " + first[1]);
            }
            else{
                System.out.println("No solution found!");
            }
        }
    }