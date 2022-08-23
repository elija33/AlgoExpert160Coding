package TwoNumberSum;

public class TwoNumberSum{
    public static int[] twoNumberSum(int[] array, int targetSum){
        for(int i = 0; i<=array.length; i++){
            for(int j = i + 1; j<=array.length; j++){
                if(array[i] + array[j] == targetSum){
                    System.out.println("Two Number Sum pair " + targetSum + "is (" + array[i] + ", " + array[j] + ")");
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int array[] = {0,-1,2,-3,1,8};
        int targetSum = 10;
        if(twoNumberSum(array, targetSum)){
            System.out.println("Valid pair exists");
        }
    }
}