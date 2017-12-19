public class MaximumDepthOfBinaryTree {
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(1);
        root.right = right;
        TreeNode lLeft = new TreeNode(1);
        left.left = lLeft;
        root.left = left;
        System.out.println(maxDepth(root));
    }
}
