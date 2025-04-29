package arrays;

public class SpiralTraverse {
    // Time-Complexity - O(n) | Space-Complexity - O(n)
    public static int[] spiralTraverse(int[][] array) {
        int startRow = 0;
        int endRow = array.length - 1;
        int startCol = 0;
        int endCol = array[0].length - 1;
        int[] result = new int[(endRow + 1) * (endCol + 1)];
        int index = 0;

        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                result[index++] = array[startRow][i];
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                result[index++] = array[i][endCol];
            }
            for (int i = endCol - 1; i >= startCol; i--) {
                if (startRow == endRow) break;
                result[index++] = array[endRow][i];
            }
            for (int i = endRow - 1; i > startRow; i--) {
                if (startCol == endCol) break;
                result[index++] = array[i][startCol];
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return result;
    }
}
