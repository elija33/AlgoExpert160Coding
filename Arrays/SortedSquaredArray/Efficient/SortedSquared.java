package SortedSquaredArray.Efficient;

public class SortedSquared {
    public static int[] SortedSquaredArray(int number[]){
        for(int i = 0; i < number.length-1; i++){
            Math.abs(number[i]);
        }
            int start = 0;
            int end = number.length;
            while(start < end){
                if(number[start] > number[end]){
                   int total[number.length] = number[start] * number[start];
                }
            }
        
        
    }

    public static void main(String[] args) {

    }
}
