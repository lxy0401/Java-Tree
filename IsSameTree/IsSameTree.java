package Demo.IsSameTree;


import Demo.TreeNode;

import java.util.LinkedList;

//非递归实现
//判断两个二叉树是否相同
public class IsSameTree {
    private static boolean isSameTree(TreeNode root1, TreeNode root2)
    {
        if(root1 == null && root2 == null)
        {
            return true;
        }
        if(root1 == null && root2 != null || root1 != null && root2 == null)
        {
            return false;
        }
        if(root1.val != root2.val)
        {
            return false;
        }
        LinkedList<TreeNode> list1 = new LinkedList<TreeNode>();
        LinkedList<TreeNode> list2 = new LinkedList<TreeNode>();
        list1.add(root1);
        list2.add(root2);
        while (!(list1.isEmpty() && list2.isEmpty()) )
        {
            TreeNode cur1 = list1.poll();
            TreeNode cur2 = list2.poll();
            if(cur1.val == cur2.val)
            {
                return true;
            }
            if(cur1.left != null && cur2.left != null)
            {
                list1.add(cur1.left);
                list2.add(cur2.left);
            }
            if(cur1.right != null && cur2.right != null)
            {
                list1.add(cur1.right);
                list2.add(cur2.right);
            }
            else
            {
                return false;
            }
        }
        return false;
    }

}
