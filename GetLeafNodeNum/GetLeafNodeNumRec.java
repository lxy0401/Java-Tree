package Demo.GetLeafNodeNum;

import Demo.TreeNode;

//递归实现
//二叉树叶子节点个数
public class GetLeafNodeNumRec {
    public static int getLeafNodeNum(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        if(root.left == null && root.right == null)
        {
            return 1;
        }
        return getLeafNodeNum(root.left) + getLeafNodeNum(root.right);
    }
}
