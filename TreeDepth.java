package TreeDepth_IsBalanced;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class TreeDepth {
    public int TreeDepth(TreeNode root) {
        int treeDepth = 0;
        if (root == null) {
            return treeDepth;
        }
        if (root.left == null && root.right ==null) {
            treeDepth = 1;
            return treeDepth;
        }

        int leftDepth = TreeDepth(root.left);
        int rightDepth = TreeDepth(root.right);

        return 1 + (leftDepth > rightDepth ? leftDepth : rightDepth);
    }
}
