package Demo.IsSameTree;

import Demo.TreeNode;

//递归实现
//判断两个二叉树是否相同
public class IsSameTreeRec {
    private static boolean isSameTree(TreeNode root1,TreeNode root2)
    {
        if(root1 == null && root2 == null)
        {
            return true;
        }
        if(root1 == null && root2 != null || root1 != null && root2 == null)
        {
            return false;
        }
        if(root1.val != root2.val)
        {
            return false;
        }
        return isSameTree(root1.left,root2.left) && isSameTree(root1.right,root2.right);
    }
}
