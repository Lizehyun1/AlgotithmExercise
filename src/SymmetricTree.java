public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return root == null || judge(root.left, root.right);
    }

    public boolean judge(TreeNode left, TreeNode right) {
        if (left == null || right == null)
            return left == right;
        if (left.val != right.val)
            return false;
        return (judge(left.left, right.right) && judge(left.right, right.left));
    }
}
