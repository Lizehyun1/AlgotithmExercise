/*
*并没有AC，测试也没有问题，我觉得算法没有问题,肯定是OJ的错！！！
*/
import java.util.*;
public class BinaryTreeZigzagLevelOrderTraversal {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<TreeNode> list = new ArrayList<>();
        if (root == null)
            return result;
        list.add(root);
        int mark = 0;
        while (list.size() != 0){
            int levelNum = list.size();
            List<Integer> subList = new LinkedList<Integer>();
            if (mark % 2 == 0){
                for (int i = 0; i < levelNum; i++) {
                    if (list.get(0).left != null)
                        list.add(list.get(0).left);
                    if (list.get(0).right != null)
                        list.add(list.get(0).right);
                    subList.add(list.remove(0).val);
                }
            }
            else{
                for (int i = list.size() - 1; i >= 0; i--) {
                    if (list.get(list.size() - 1).right != null)
                        list.add(0, list.get(list.size() - 1).right);
                    if (list.get(list.size() - 1).left != null)
                        list.add(0, list.get(list.size() - 1).left);
                    subList.add(list.remove(list.size() - 1).val);
                }
            }
            result.add(subList);
            mark++;
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode l_left = new TreeNode(4);
        TreeNode r_left = new TreeNode(5);
        TreeNode l_right = new TreeNode(6);
        TreeNode r_right = new TreeNode(7);
        TreeNode ll_left = new TreeNode(8);
        TreeNode rr_right = new TreeNode(9);
        l_left.left = ll_left;
        r_right.right = rr_right;
        right.left = l_right;
        right.right = r_right;
        left.left = l_left;
        left.right = r_left;
        node.left = left;
        node.right = right;
        List<List<Integer>> result = zigzagLevelOrder(node);
        for (List<Integer> n : result){
            for (Integer integer : n){
                System.out.print(integer + " ");
            }
            System.out.println();
        }

    }
}
