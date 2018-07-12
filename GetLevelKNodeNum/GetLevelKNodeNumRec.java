package Demo.GetLevelKNodeNum;

import Demo.TreeNode;
//递归实现
//二叉树第K层节点个数
public class GetLevelKNodeNumRec {
    public static int getLevelKNodeNum(TreeNode root,int k)
    {
        if(root == null || k <= 0)
        {
            return 0;
        }
        if(k == 1)
        {
            return 1;
        }
        return getLevelKNodeNum(root.left,k - 1) + getLevelKNodeNum(root.right,k - 1);
    }
}
