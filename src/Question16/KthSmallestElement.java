package Question16;

/*kth the smallest element in a BST
Given the root of a binary search tree, and an integer k, return the kth the smallest value (1-indexed)of all the values of the nodes in the tree

*/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class KthSmallestElement {
    private int count;
    private int result;


    public static void main(String[] args) {
        // Example usage
        KthSmallestElement solution = new KthSmallestElement();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(9);

        root.left.right = new TreeNode(2);
        /*
         *                               3
         *                       1               4
         *                             2                 7
         *                                           5           9
         *
         * */

        int k = 6;
        int kthSmallest = solution.kthSmallest(root, k);
        System.out.println("The " + k + "th smallest element in the BST: " + kthSmallest);
    }

    private int kthSmallest(TreeNode root, int k) {
        count = 0;
        result = 0;
        traversInOrder(root, k);
        return result;
    }

    private void traversInOrder(TreeNode node, int k) {
        if (node == null) return;

        traversInOrder(node.left, k);
        count++;

        if (count == k) {
            result = node.val;
            return;
        }
        traversInOrder(node.right, k);
    }
}
