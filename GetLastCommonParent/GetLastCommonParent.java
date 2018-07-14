package Demo.GetLastCommonParent;

import Demo.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;

public class GetLastCommonParent {
    private static TreeNode getLastCommonParent(TreeNode root,TreeNode node1,TreeNode node2)
    {
        if(root == null || node1 == null || node2 == null)
        {
            return  null;
        }
        ArrayList<TreeNode> list1 = new ArrayList<TreeNode>();
        ArrayList<TreeNode> list2 = new ArrayList<TreeNode>();
        boolean result1 = getNodePath(root,node1,list1);
        boolean result2 = getNodePath(root,node2,list2);
        if(!result1 || !result2)
        {
            return null;
        }
        TreeNode last = null;
        Iterator<TreeNode> iterator1 = list1.iterator();
        Iterator<TreeNode> iterator2 = list2.iterator();

        while (iterator1.hasNext() && iterator2.hasNext())
        {
            TreeNode temp1 = iterator1.next();
            TreeNode temp2 = iterator2.next();
            if(temp1 == temp2)
            {
                last = temp1;
            }
            else
            {
                break;
            }
        }
        return last;
    }

    private static boolean getNodePath(TreeNode root, TreeNode node, ArrayList<TreeNode> list) {
        if(root == null)
        {
            return false;
        }
        list.add(root);
        if(root == node)
        {
            return true;
        }
        boolean found = false;
        found = getNodePath(root.left,node,list);
        if(!found)
        {
            found = getNodePath(root.right,node,list);
        }
        if(!found)
        {
            list.remove(root);
        }
        return found;
    }
}
