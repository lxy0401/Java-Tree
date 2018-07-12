package Demo.mirrorTree;

//递归的实现
//求二叉树的镜像
//破坏原来的树

import Demo.TreeNode;

public class mirrorRec {
    public static TreeNode mirror(TreeNode root)
    {
        if(root == null)
        {
            return null;
        }
        TreeNode left = mirror(root.left);//此时变为右子树了
        TreeNode right = mirror(root.right);//此时变为左子树了

        root.left = left;
    }
}
