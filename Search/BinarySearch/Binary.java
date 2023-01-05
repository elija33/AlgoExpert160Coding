package Search.BinarySearch;

public class Binary {
    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
     public static void main(String[] args) {
        int arr[] = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        int target = 33;
        System.out.println(binarySearch(arr, target));
     }
}