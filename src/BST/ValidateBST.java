package BST;

public class ValidateBST {
    public static boolean validateBST(Node tree) {
        return validateBSTHelper(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private static boolean validateBSTHelper(Node node, int minValue, int maxValue) {
        if(node == null) {
            return true;
        }
        if(node.key < minValue || node.key >=maxValue) {
            return false;
        }

        return validateBSTHelper(node.left, minValue, node.key) && validateBSTHelper(node.right, node.key, maxValue);
    }
}
