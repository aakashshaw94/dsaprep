import arrays.SortSquaredArrays;
import arrays.TargetSum;
import arrays.ValidateSubsequence;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //===========================    ARRAYS ============================

        // TargetSum Solution 1
        System.out.println(Arrays.toString(TargetSum.targetSumWithMap(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10)));

        //TargetSum Solution 2
        System.out.println(Arrays.toString(TargetSum.targetSumWithoutMap(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10)));

        //ValidateSubsequence
        System.out.println(ValidateSubsequence.isValid(List.of(5, 1, 22, 25, 6, -1, 8, 10), List.of(1, 6, -1, 10)));

        //SortSquaredArrays
        System.out.println(Arrays.toString(SortSquaredArrays.sortedSquaredArray(new int[] {-7, -5, -4, 3, 6, 8, 9})));
    }
}