package Demo.OrderTraversal.InOrderTraversal;

import Demo.TreeNode;

public class InOrderTraversalRec {
    public static void inOrderTraversal(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.val);
        inOrderTraversal(root.right);
    }
}
