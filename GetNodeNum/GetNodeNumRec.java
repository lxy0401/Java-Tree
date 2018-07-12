package Demo.GetNodeNum;


import Demo.TreeNode;

//递归的方式实现O(n)
//二叉树中节点个数
//二叉树节点个数 = 左子树节点个数 + 右子树节点个数 + 1
public class GetNodeNumRec {
    public static int getNodeNum(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        return getNodeNum(root.left) + getNodeNum(root.right) + 1;
    }

}
