package Demo.OrderTraversal.LevelOrderTraversal;

import Demo.TreeNode;

import java.util.LinkedList;

//非递归的实现
//二叉树的层序遍历
public class LevelOrderTraversal {
    public static void levelOrderTraversal(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        LinkedList<TreeNode> list = new LinkedList<>();//使用队列（先进先出）
        list.add(root);
        while(!list.isEmpty())
        {
            TreeNode cur = list.pollFirst();//移除队列第一个元素
            System.out.println(cur.val);
            if(cur.left != null)
            {
                list.add(cur.left);
            }
            if(cur.right != null)
            {
                list.add(cur.right);
            }
        }
    }

}
