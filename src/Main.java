import BST.BSTConstruction;
import BST.FindClosestValueInBST;
import BST.ValidateBST;
import FamousAlgorithms.KadanesAlgorithm;
import arrays.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //===========================    ARRAYS ============================

        // TargetSum Solution 1
        System.out.println("Target Sum Soln.1 - "+Arrays.toString(TargetSum.targetSumWithMap(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10)));

        //TargetSum Solution 2
        System.out.println("Target Sum Soln.2 - " + Arrays.toString(TargetSum.targetSumWithoutMap(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10)));

        //ValidateSubsequence
        System.out.println("Valid Subsequence - "+ValidateSubsequence.isValid(List.of(5, 1, 22, 25, 6, -1, 8, 10), List.of(1, 6, -1, 10)));

        //SortSquaredArrays
        System.out.println("Sorted Squared Array - "+Arrays.toString(SortSquaredArrays.sortedSquaredArray(new int[] {-7, -5, -4, 3, 6, 8, 9})));

        //MinimumNonConstructibleChange
        System.out.println("Minimum Non Constructible Change - "+MinimumNonConstructibleChange.minimumNonConstructibleChange(new int[] {5, 7, 1, 1, 2, 3, 22}));

        //ThreeNumberSum
        List<Integer[]> res = ThreeNumberSum.threeNumberSum(new int[]{12, 3, 1, 2, -6, 5, -8, 6}, 0);

        System.out.println("Three Number Sum - ");
        System.out.println(
                res.stream()
                        .map(Arrays::toString)       // convert each Integer[] to "[a, b, c]"
                        .collect(Collectors.joining(", ", "[", "]")) // join them all in a single list
        );

        //SmallestDifference
        System.out.println("Smallest Difference - "+Arrays.toString(SmallestDifference.smallestDifference(new int[] {-1, 5, 10, 20, 28, 3}, new int[] {26, 134, 135, 15, 17})));

        //MoveElementToEnd
        System.out.println("Move Element To End - "+Arrays.toString(MoveElementToEnd.moveElementsToEnd(new int[] {2, 1, 2, 2, 2, 3, 4, 2}, 2)));

        //MonoticArray
        System.out.println("Is Monotic Array - "+MonotonicArray.isMonotonic(new int[] {1, 2, 2, 3}));

        //ArrayOfProducts
        System.out.println("Array of Products - "+Arrays.toString(ArrayOfProducts.arrayOfProducts(new int[] {5, 1, 4, 2})));

        //SpiralTraverse
        System.out.println("Spiral Traverse - "+Arrays.toString(SpiralTraverse.spiralTraverse(new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        })));

        //LongestPeak
        System.out.println("Longest Peak - "+LongestPeak.longestPeak(new int[] {1,2,3,3,4,0,10,6,5,-1,-3,2,3}));

        //FirstDuplicateValue
        System.out.println("First Duplicate Value - "+FirstDuplicateValue.firstDuplicateValue(new int[] {2, 1, 5, 2, 3, 3, 4}));


        //==================================== BST ========================================
        BSTConstruction bstConstruction = new BSTConstruction();
        bstConstruction.buildFromInput(new int[] {10, 5, 15, 2, 5, 13, 22} );
        bstConstruction.inorder();

        // FindClosestValueInBST
        System.out.println("\nClosest Value in BST - "+ FindClosestValueInBST.findClosestValueInBST(bstConstruction.root, 12));

        //ValidateBST
        System.out.println("Is BST Valid - "+ ValidateBST.validateBST(bstConstruction.root));

        //=========================== Famouse Algorithms ===========================
        //Kadane's Algorithm
        System.out.println("Kadane's Algorithm - "+ KadanesAlgorithm.kadanesAlgorithm(new int[] {2, 3, 6, -1, 4, 5, -2, 1}) );

    }
}