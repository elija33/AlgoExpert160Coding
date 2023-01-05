package SearchforRange;

public class Range {
    public static int[] Search(int array[], int target){
        int start = 0;
        int end = array.length-1;
        while(start <= end){
            if(array[start] < target){
                start++;
            }
            else if(array[end] > target){
                end--;
            }
            if(array[start] == target && array[end] == target){
                return new int[] {start, end};
            }
        }
        return new int[] {-1, -1};
    }
    // 0, 1, 21, 33, 45, 45, 45, 45, 45, 45, 61, 71, 73
    //                        ^
    public static void main(String[] args) {
        int array[] = {0, 1, 21, 33, 45, 45, 45, 45, 45, 45, 61, 71, 73};
        int target = 45;
        System.out.println(Search(array, target));
    }
}
