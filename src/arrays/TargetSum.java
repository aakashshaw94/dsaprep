package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TargetSum {
    // Time-Complexity - O(n) | Space-Complexity - O(n)
    public static int[] targetSumWithMap(int[] arr, int targetSum) {
        Set<Integer> nums = new HashSet<>();
        for (int num : arr) {
            int potentialMatch = targetSum - num;
            if(nums.contains(potentialMatch)) {
                return new int[] {potentialMatch, num};
            }else {
                nums.add(num);
            }
        }
        return new int[0];
    }
    // Time-Complexity - O(nlog(n)) | Space-Complexity - O(1)
    public static int[] targetSumWithoutMap(int[] arr, int targetSum) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            int currentSum = arr[left] + arr[right];
            if(currentSum == targetSum){
                return new int[] {arr[left], arr[right]};
            } else if (currentSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
}


