package Demo.OrderTraversal.PostOrderTraversal;

import Demo.TreeNode;

//递归的实现
//二叉树的后序遍历
public class PostOrderTraversalRec {
    public static void postOrderTraversalRec(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        postOrderTraversalRec(root.left);
        postOrderTraversalRec(root.right);
        System.out.println(root.val);
    }

}
