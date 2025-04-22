package arrays;

public class MoveElementToEnd {
    // Time-Complexity - O(n) | Space-Complexity - O(1)
    public static int[] moveElementsToEnd(int[] array, int toMove) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] == toMove && array[right] != toMove) {
                swap(array, left, right);
            }
            if (array[left] != toMove) {
                left++;
            }
            if (array[right] == toMove) {
                right--;
            }
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
