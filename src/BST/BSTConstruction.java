package BST;


class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BSTConstruction {
    public Node root;
    // Constructor
    public BSTConstruction() {
        root = null;
    }
    // Insert method (recursive)
    void insert(int key) {
        root = insertRec(root, key);
    }
    // Helper method for insertion
    Node insertRec(Node root, int key) {
        // Base case: empty tree or reached a leaf
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Recurse down the tree
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        // Return the unchanged root node
        return root;
    }

    // In-order traversal (Left, Root, Right)
    public void inorder() {
        inorderRec(root);
    }

    // Helper method for in-order traversal
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    // Build BST from array where first element is root
    public void buildFromInput(int[] arr) {
        if (arr == null || arr.length == 0) return;

        // Set the first element as root
        root = new Node(arr[0]);

        // Insert the rest of the elements
        for (int i = 1; i < arr.length; i++) {
            insert(arr[i]);
        }
    }
}
