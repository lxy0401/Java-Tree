package Demo.GetNodeNum;

import Demo.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


//非递归方式实现O(n)
//二叉树节点个数
public class GetNodeNum {
    public static int getNodeNum(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();//创建队列
        queue.add(root);
        int count = 1;//此时节点个数为1（插入了根节点）
        while (!queue.isEmpty())
        {
            TreeNode cur = queue.remove();//将队列中的一个元素从头出队列
            if(cur.left != null)
            {
                queue.add(cur.left);
                count++;
            }
            if(cur.right != null)
            {
                queue.add(cur.right);
                count++;
            }
        }
        return count;
    }
}
