package Demo.IsAVLTree;

import Demo.TreeNode;

import static Demo.GetTreeDepth.GetTreeNodeRec.getTreeDepth;

//递归实现
//二叉树是否为平衡二叉树
//平衡二叉树AVL：左右子树之差不大于1,默认空树是AVL
public class IsAVL {
    public static boolean isAVL(TreeNode root)
    {
        if(root == null)
        {
            return true;
        }
        if(Math.abs(getTreeDepth(root.left) - getTreeDepth(root.right)) > 1)
        {
            return false;
        }
        boolean leftisAVL = isAVL(root.left);
        boolean rightisAVL = isAVL(root.right);
        return leftisAVL && rightisAVL;
    }
}
