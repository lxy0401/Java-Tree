package Demo.GetLeafNodeNum;

import Demo.TreeNode;

import java.util.LinkedList;

public class GetLeafNodeNum {
    public static int getLeafNodeNum(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        list.add(root);
        int count = 0;
        while (!list.isEmpty())
        {
            TreeNode cur = list.pop();
            if(cur.left != null)
            {
                list.add(cur.left);
            }
            if(cur.right != null)
            {
                list.add(cur.right);
            }
            if(cur.left == null && cur.right == null)
            {
                count++;
            }
        }
        return count;
    }
}
