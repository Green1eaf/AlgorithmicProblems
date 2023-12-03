package leetcode;

//  https://leetcode.com/problems/minimum-depth-of-binary-tree/

public class MinimumDepthsOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = minDepth(root.left) + 1;
        int right = minDepth(root.right) + 1;
        if (root.left == null) return right;
        if (root.right == null) return left;
        return Math.min(left, right);
    }
}
