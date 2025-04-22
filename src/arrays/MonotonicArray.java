package arrays;

public class MonotonicArray {
    public static boolean isMonotonic(int[] array) {
        if (array.length < 2) {
            return true;
        }
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                isDecreasing = false;
            } else if (array[i] < array[i - 1]) {
                isIncreasing = false;
            }
        }
        return isIncreasing || isDecreasing;
    }
}
