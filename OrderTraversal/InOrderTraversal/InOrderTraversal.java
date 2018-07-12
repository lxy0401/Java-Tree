package Demo.OrderTraversal.InOrderTraversal;

import Demo.TreeNode;

import java.util.Stack;

//非递归实现
//二叉树的中序遍历
public class InOrderTraversal {
    public static void inOrderTraversal(TreeNode root)
    {
        if(root == null)
        {
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();//使用栈
        TreeNode cur = root;
        while (true)
        {
            while (cur != null)//从根节点开始，将节点的左子树依次入栈
            {
                stack.push(cur);
                cur = cur.left;
            }
            if(stack.isEmpty())
            {
                break;
            }
            cur = stack.pop();//左子树入栈结束，将栈中元素出栈，打印
            System.out.println(cur.val);
            cur = cur.right;//再循环将右子树入栈
        }
    }

}
