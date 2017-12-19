import java.util.*;
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        help(root, result);
        return result;
    }

    public void help(TreeNode root, List<Integer> result){
        if (root != null){
            if (root.left != null)
                help(root.left, result);
            if (root.right != null)
                help(root.right, result);
            result.add(root.val);
        }
    }
}
