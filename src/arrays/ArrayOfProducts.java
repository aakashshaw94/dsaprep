package arrays;

public class ArrayOfProducts {
    // Time-Complexity - O(n) | Space-Complexity - O(n)
    public static int[] arrayOfProducts(int[] array) {
        int[] products = new int[array.length];
        int productSoFar = 1;

        for (int i = 0; i < array.length; i++) {
            products[i] = productSoFar;
            productSoFar *= array[i];
        }

        productSoFar = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            products[i] *= productSoFar;
            productSoFar *= array[i];
        }

        return products;
    }
}
