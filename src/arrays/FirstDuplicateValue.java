package arrays;

public class FirstDuplicateValue {
    // Time-Complexity - O(n) | Space-Complexity - O(1)
    public static int firstDuplicateValue(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int absValue = Math.abs(array[i]);
            if (array[absValue - 1] < 0) {
                return absValue;
            } else {
                array[absValue - 1] *= -1;
            }
        }
        return -1;
    }
}
