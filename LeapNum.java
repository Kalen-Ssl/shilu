package fuxi;

import java.util.LinkedList;

//二叉树叶子节点的个数
public class LeapNum {
    public static int getLeafNodeNum1(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        return getLeafNodeNum1(root.left) + getLeafNodeNum1(root.right);
    }


    public static int getLeafNodeNum2(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int count = 0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode cur = queue.removeFirst();
            if(cur.left == null && cur.right == null) {
                count++;
            }
            if(cur.left != null) {
                queue.add(cur.left);
            }
            if(cur.right != null) {
                queue.add(cur.right);
            }
        }
        return count;
    }

}
