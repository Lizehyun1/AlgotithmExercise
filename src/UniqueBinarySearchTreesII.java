import java.util.*;
public class UniqueBinarySearchTreesII {
    public int numTrees(int n) {
        List<TreeNode> list = geeTrees(1, n);
        return list.size();
    }

    public List<TreeNode> geeTrees(int start, int end){
        List<TreeNode> list = new ArrayList<TreeNode>();
        if (start > end){
            list.add(null);
            return list;
        }
        if (start == end){
            list.add(new TreeNode(start));
            return list;
        }
        List<TreeNode> left = new ArrayList<TreeNode>();
        List<TreeNode> right = new ArrayList<TreeNode>();
        for (int i = start; i <= end; i++) {
            left = geeTrees(start, i - 1);
            right = geeTrees(i + 1, end);
            for (TreeNode leftNode : left){
                for(TreeNode rightNode : right){
                    TreeNode root = new TreeNode(i);
                    root.left = leftNode;
                    root.right = rightNode;
                    list.add(root);
                }
            }
        }
        return list;
    }
}
