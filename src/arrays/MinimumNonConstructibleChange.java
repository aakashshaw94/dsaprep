package arrays;

import java.util.Arrays;

public class MinimumNonConstructibleChange {
    public static int minimumNonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int currentChange = 0;
        for (int coin : coins) {
            if (coin > currentChange + 1) {
                return currentChange + 1;
            }
            currentChange += coin;
        }
        return currentChange + 1;
    }
}
