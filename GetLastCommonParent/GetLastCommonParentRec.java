package Demo.GetLastCommonParent;

import Demo.TreeNode;

//递归实现
//二叉树两个节点的最小父节点
public class GetLastCommonParentRec {
    public static TreeNode getLastCommonParent(TreeNode root, TreeNode node1, TreeNode node2)
    {
        if(root == null || node1 == null || node2 == null)
        {
            return null;
        }
        if(nodeInSameTree(root.left,node1))//node1在左子树
        {
            if(nodeInSameTree(root.right,node2))//node2在右子树
            {
                return root;//根节点
            }
            else//node2在左子树
            {
                return getLastCommonParent(root.left,node1,node2);//递归判断
            }
        }
        else //node1在右子树
        {
            if(nodeInSameTree(root.left,node2))//node2在左子树
            {
                return root;//根节点
            }
            else//node2在右子树
            {
                return getLastCommonParent(root.right,node1,node2);//递归判断
            }
        }
    }

    private static boolean nodeInSameTree(TreeNode root, TreeNode node) {
        if(root == null || node == null)
        {
            return false;
        }
        if(root == node)
        {
            return true;
        }
        boolean inSameTree = nodeInSameTree(root.left,node);
        if(!inSameTree)
        {
            inSameTree = nodeInSameTree(root.right,node);
        }
        return inSameTree;
    }
}
