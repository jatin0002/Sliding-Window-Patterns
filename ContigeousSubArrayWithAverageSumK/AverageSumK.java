import java.util.Arrays;

// Problem Statement

// Given an array, find the average of all contigeous subarray of size k

// Sample Input
// arr = [1, 3, 2, 6 , -1, 4, 1, 8, 2];

// Sample Output
// [2.2, 2.8, 2.4, 3.6, 2.8]

class AverageSumK {
    public static double[] ContigeousSubArrayWithAverageSumK(int[] arr, int k) {
        double[] result = new double[arr.length - k + 1];
        int windowStart =0;
        double windowSum =0;
        for(int windowEnd =0 ; windowEnd<arr.length ; windowEnd++){
            windowSum += arr[windowEnd];
            if(windowEnd >= k-1){
                result[windowStart] = windowSum/k;
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 6 , -1, 4, 1, 8, 2 };
        int k = 5;
        double[] result = ContigeousSubArrayWithAverageSumK(arr, k);
        System.out.println(Arrays.toString(result));
    }
}