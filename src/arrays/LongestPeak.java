package arrays;

public class LongestPeak {
    // Time-Complexity - O(n) | Space-Complexity - O(1)
    public static int longestPeak(int[] array) {
        int longestPeakLength = 0;
        int i = 1;

        while (i < array.length - 1) {
            boolean isPeak = array[i] > array[i - 1] && array[i] > array[i + 1];
            if (!isPeak) {
                i++;
                continue;
            }
            int leftIdx = i - 2;
            while (leftIdx >= 0 && array[leftIdx] < array[leftIdx + 1]) {
                leftIdx--;
            }
            int rightIdx = i + 2;
            while (rightIdx < array.length && array[rightIdx] < array[rightIdx - 1]) {
                rightIdx++;
            }
          /**
           *
           * Let’s break it down:
           *
           * leftIdx: ends one position before the start of the increasing slope.
           *
           * rightIdx: ends one position after the end of the decreasing slope.
           *
           * So the full peak is from index leftIdx + 1 to rightIdx - 1.
           *
           * That’s why the length is calculated as:
           *
           * currentPeakLength = (rightIdx - 1) - (leftIdx + 1) + 1
           *                   = rightIdx - leftIdx - 1
           *
           * */
          int currentPeakLength = rightIdx - leftIdx - 1;
          longestPeakLength = Math.max(longestPeakLength, currentPeakLength);
          i = rightIdx;
        }
        return longestPeakLength;
    }
}
