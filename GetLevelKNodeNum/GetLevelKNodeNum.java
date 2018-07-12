package Demo.GetLevelKNodeNum;

//非递归实现
//二叉树第K层节点个数
//类似于求二叉树深度
import Demo.TreeNode;

import java.util.LinkedList;

public class GetLevelKNodeNum {
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
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        list.add(root);
        int curCount = 1;
        int i = 1;
        int nextCount = 0;
        while(!list.isEmpty() && i < k)
        {
            TreeNode cur = list.pop();
            curCount--;
            if(cur.left != null)
            {
                list.add(cur.left);
                nextCount++;
            }
            if(cur.right != null)
            {
                list.add(cur.right);
                nextCount++;
            }
            if(curCount == 0)
            {
                curCount = nextCount;
                i++;
                nextCount = 0;
            }
        }
        return curCount;
    }
}
