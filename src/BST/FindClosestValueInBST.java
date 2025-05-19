package BST;

public class FindClosestValueInBST {
  public static int findClosestValueInBST(Node tree, int target) {
    return findClosestValueInBSTHelper(tree, target, tree.key); // Start with root's key as closest
  }

  private static int findClosestValueInBSTHelper(Node node, int target, int closest) {
    if (node == null) {
      return closest;
    }

    if (Math.abs(target - closest) > Math.abs(target - node.key)) {
      closest = node.key;
    }

    if (target < node.key) {
      return findClosestValueInBSTHelper(node.left, target, closest);
    } else if (target > node.key) {
      return findClosestValueInBSTHelper(node.right, target, closest);
    } else {
      return closest; // Exact match
    }
  }
}
