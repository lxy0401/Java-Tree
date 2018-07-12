package Demo.GetTreeDepth;

import Demo.TreeNode;

import java.util.LinkedList;

//非递归实现O(n)
//二叉树的深度
public class GetTreeDept {
    public static int getTreeDepth(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();//创建链表
        list.add(root);
        int curCount = 1;//本层元素个数
        int nextCount = 0;//下一层元素个数
        int depth = 0;//二叉树深度
        while(!list.isEmpty())
        {
            TreeNode cur = list.remove();//先移出一个元素
            curCount--;//此时当前行元素个数-1
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
            if(curCount == 0)//若当前行元素个数=0，说明本行遍历结束，要开始进行下一行
            {
                depth++;//深度+1
                curCount = nextCount;//当前行元素个数就变为之前下一行元素个数
                nextCount = 0;//下一行元素个数变为0
            }
        }
        return depth;
    }
}
