import java.util.Stack;

public class ValidateBinarySearchTree {
    public static boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        Stack<Integer> res = new Stack<>();
        res = travel(root, res);
        int temp = res.pop();
        while (!res.empty()) {
            if (temp <= res.peek())
                return false;
            temp = res.pop();
        }
        return true;
    }

    public static Stack<Integer> travel(TreeNode root, Stack<Integer> res) {
        if (root != null){
            if (root.left != null)
                travel(root.left, res);
            res.push(root.val);
            if (root.right != null)
                travel(root.right, res);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(1);
        root.left = left;
        System.out.println(isValidBST(root));
    }
}
