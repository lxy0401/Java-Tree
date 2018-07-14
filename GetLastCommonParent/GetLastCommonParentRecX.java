package Demo.GetLastCommonParent;

import Demo.TreeNode;

//递归实现（递归精简版）
//二叉树两个节点的最小父节点
public class GetLastCommonParentRecX {
    public static TreeNode getLastCommonParent(TreeNode root,TreeNode node1,TreeNode node2)
    {
        if(root == null || node1 == null || node2 == null)
        {
            return null;
        }
        if(root.equals(node1) || root.equals(node2))
        {
            return root;
        }
        TreeNode leftCommon = getLastCommonParent(root.left,node1,node2);
        TreeNode rightCommon = getLastCommonParent(root.right,node1,node2);
        if(leftCommon != null && rightCommon != null)
        {
            return root;
        }
        else if(leftCommon == null)
        {
            return rightCommon;
        }
        return leftCommon;
    }
}
