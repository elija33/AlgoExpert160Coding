package ShiftedBinarySearch;

public class ShiftedBinary {
    public static int ShiftedBinarySearch(int array[], int target){
        int start = 0;
        int end = array.length-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(array[mid] == target){
                return mid;
            }
            if(array[mid] > array[start]){
                if(target >= array[start] && target < array[mid]){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
            else if(target > array[mid] && target <= array[end]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] = {45, 61, 71, 72, 73, 0, 1, 21, 33, 37};
        int target =  33;
        System.out.println(ShiftedBinarySearch(array, target));
    }
}
