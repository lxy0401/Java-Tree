package Demo.OrderTraversal.PostOrderTraversal;

import Demo.TreeNode;

import java.util.Stack;

//非递归实现
//二叉树的后序遍历
public class PostOrderTraversal {
    public static void postOrderTraversalRec(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();//stack栈中保存cur和他的左右子树
        Stack<TreeNode> outputStack = new Stack<TreeNode>();//outputStack栈中保存stack栈翻转过来的栈
        stack.push(root);
        while (!stack.isEmpty())//保证将stack栈中内容全部翻转到outputStack栈中
        {
            TreeNode cur = stack.pop();
            outputStack.push(cur);
            if(cur.left != null)
            {
                stack.push(cur.left);
            }
            if(cur.right != null)
            {
                stack.push(cur.right);
            }
        }
        while (!outputStack.isEmpty())
        {
            System.out.println(outputStack.pop().val);//将outputStack栈中内容全部打印
        }
    }
}
