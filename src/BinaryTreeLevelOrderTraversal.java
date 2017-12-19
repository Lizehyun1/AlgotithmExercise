import java.util.*;
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null)
            return result;
        TreeNode current = null;
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelNume = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for (int i = 0; i < levelNume; i++) {
                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            result.add(subList);
        }
        return result;
    }
}


