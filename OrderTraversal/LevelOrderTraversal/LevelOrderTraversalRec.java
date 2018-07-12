package Demo.OrderTraversal.LevelOrderTraversal;

import Demo.TreeNode;

import java.util.ArrayList;

//递归的实现
//二叉树的层序遍历
//用一个大的ArrayList，里面包含了每一层的ArrayList
//大的ArrayList的size和层数depth有关
public class LevelOrderTraversalRec {
    public static void levelOrderTraversal(TreeNode root)
    {

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        depth(root,0,result);
        System.out.println(result);
    }

    private static void depth(TreeNode root, int depth, ArrayList<ArrayList<Integer>> result) {
        if(root == null)
        {
            return;
        }
        if(depth >= result.size())
        {
            result.add(new ArrayList<Integer>());
        }
        result.get(depth).add(root.val);
        depth(root.left,depth + 1,result);
        depth(root.right,depth + 1,result);
    }
}
