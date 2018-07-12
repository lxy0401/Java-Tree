package Demo.OrderTraversal.PreOrderTraversal;

import Demo.TreeNode;

//递归实现
//二叉树的先序遍历
public class PreOrderTraversalRec {
    public static void preOrderTraversal(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        System.out.println(root.val);
        preOrderTraversal(root.left) ;
        preOrderTraversal(root.right);
    }
}
