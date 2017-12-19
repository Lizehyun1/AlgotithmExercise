public class RecoverBinarySearchTree {
    private TreeNode firstNode = null;
    private TreeNode secondNode = null;
    private TreeNode prevNode = new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {
        travel(root);
        int temp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp;
    }

    public void travel(TreeNode root){
        if (root == null)
            return;

        travel(root.left);
        // do some business
        if (firstNode == null && prevNode.val >= root.val){
            firstNode = prevNode;
        }

        if (firstNode != null && prevNode.val >= root.val){
            secondNode = root;
        }

        prevNode = root;
        // business ends
        travel(root.right);
    }
}
