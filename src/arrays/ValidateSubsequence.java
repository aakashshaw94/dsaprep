package arrays;

import java.util.List;

public class ValidateSubsequence {
    // Time-Complexity - O(n) | Space-Complexity - O(1)
    public static boolean isValid(List<Integer> array, List<Integer> sequence) {
        int arrIdx = 0;
        int seqIdx = 0;
        while(arrIdx < array.size() && seqIdx < sequence.size()) {
            if(array.get(arrIdx).equals(sequence.get(seqIdx))) {
                seqIdx++;
            }
            arrIdx++;
        }
        return seqIdx == sequence.size();
    }
}
