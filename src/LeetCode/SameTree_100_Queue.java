package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class SameTree_100_Queue {

    public boolean isSameTree(SameTree_100.TreeNode p, SameTree_100.TreeNode q){
        Deque<SameTree_100.TreeNode> stack = new ArrayDeque<>();
        SameTree_100.TreeNode current_p = p;
        SameTree_100.TreeNode current_q = q;

        while(current_p != null || !stack.isEmpty()){

            while(current_p != null && current_q != null){
            stack.addLast(current_q);
            stack.addLast(current_p);
            current_p = current_p.left;
            current_q = current_q.left;
            }

            if ((current_p == null) != (current_q == null)) return false;

            current_p = stack.removeLast();
            current_q = stack.removeLast();
            if(current_p.val != current_q.val) return false;

            current_p = current_p.right;
            current_q = current_q.right;

        }
        return true;
    }

}
