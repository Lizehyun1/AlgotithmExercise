import java.util.*;
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        help(root, result);
        return result;
    }
    public void help(TreeNode node, List<Integer> result){
        if (node != null){
            result.add(node.val);
            if (node.left != null)
                help(node.left, result);
            if (node.right != null)
                help(node.right, result);
        }
    }
}
