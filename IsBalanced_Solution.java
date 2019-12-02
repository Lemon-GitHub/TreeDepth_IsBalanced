package TreeDepth_IsBalanced;

public class IsBalanced_Solution {
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

    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }

        int leftDepth = TreeDepth(root.left);
        int rightDepth = TreeDepth(root.right);


        if (leftDepth - rightDepth > 1 || rightDepth - leftDepth > 1) {
            return false;
        }

        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
}
