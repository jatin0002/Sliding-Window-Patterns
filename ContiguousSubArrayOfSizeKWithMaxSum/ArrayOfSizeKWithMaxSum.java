public class ArrayOfSizeKWithMaxSum {

    //Problem Statement

    // Given an array of positive numbers and a positive number ‘k’, 
    // find the maximum sum of any contiguous subarray of size ‘k’.

    // Sample Input
    // [1,2,3,4,5 ]

    // Sample Output
    // 12

    public static int ArrayOfSizeKWithMaxSum(int[] arr , int k){
        int max = Integer.MIN_VALUE;
        int windowStart =0;
        int windowSum =0;
        for(int windowEnd =0 ; windowEnd<arr.length ; windowEnd++){
            windowSum += arr[windowEnd];
            if(windowEnd >= k-1){
                if(max < windowSum){
                    max = windowSum;
                }
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,1};
        int k = 3;
        int result = ArrayOfSizeKWithMaxSum(arr, k);
        System.out.println(result);
    }
}
