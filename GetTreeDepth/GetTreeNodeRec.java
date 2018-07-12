package Demo.GetTreeDepth;

import Demo.TreeNode;


//递归实现O(n)
//二叉树深度 = 根节点左右子树深度更大的深度 + 1
public class GetTreeNodeRec {
    public static int getTreeDepth(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;
        return Math.max(getTreeDepth(leftNode),getTreeDepth(rightNode)) + 1;
    }
}
