package LeetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TreeNodeInOrderDeque {
    public List<Integer> inorderTraversal(SameTree_100.TreeNode root){
        List<Integer> list = new ArrayList<>();
        Deque<SameTree_100.TreeNode> stack = new ArrayDeque<>();
        SameTree_100.TreeNode current = root;

        while (!stack.isEmpty() || current != null){

            while(current != null){
                stack.addLast(current);
                current = current.left;
            }
            SameTree_100.TreeNode node = stack.removeLast();
            list.add(node.val);
            current = node.right;
        }
        return list;
    }

}
