package Demo.OrderTraversal.PreOrderTraversal;

import Demo.TreeNode;

import java.util.Stack;

//非递归实现
//二叉树的先序遍历
public class PreOrderTraversal {
    public static void preOrderTraversal(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();//使用栈
        stack.add(root);
        while (!stack.isEmpty())
        {
            TreeNode cur = stack.pop();//先将元素出栈
            System.out.println(cur.val);//打印内容
            if(cur.right != null)
            {
                stack.push(cur.right);//先入栈右节点，因为栈是先进后出（
                // 先序遍历是先访问左子树，即先出栈打印左子树，所以后入栈左子树）
            }
            if(cur.left != null)
            {
                stack.push(cur.left);
            }
        }
    }
}
