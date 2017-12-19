import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal1 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        help(root,result);
        return result;
    }

    public void help(TreeNode node, List<Integer> result){
        if (node != null){
            if (node.left != null)
                help(node.left, result);
            result.add(node.val);
            if (node.right != null)
                help(node.right, result);
        }
    }
}
