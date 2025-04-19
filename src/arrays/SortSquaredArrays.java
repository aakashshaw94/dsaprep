package arrays;

public class SortSquaredArrays {
    /**
     * Solution works only when the array is sorted.
     * Consider the numbers to be on a number line, since the array is sorted
     * we will compare the abs val of the numbers keeping dual pointer at the start and
     * end respectively. Then populate the result array from the end thus updating the pointers
     * accordingly.
     *
     * Time-Complexity - O(n) | Space-Complexity - O(n)
     *
     * */
    public static int[] sortedSquaredArray(int[] array) {
        int[] sortedSquare = new int[array.length];

        int smallerValueIdx=0;
        int largerValueIdx= array.length-1;

        for (int idx = array.length - 1; idx >=0 ; idx--) {
            int smallerValue = array[smallerValueIdx];
            int largerValue = array[largerValueIdx];

            if(Math.abs(smallerValue) > Math.abs(largerValue)) {
                sortedSquare[idx] = smallerValue * smallerValue;
                smallerValueIdx++;
            } else {
                sortedSquare[idx] = largerValue * largerValue;
                largerValueIdx--;
            }
        }
        return sortedSquare;
    }
}
