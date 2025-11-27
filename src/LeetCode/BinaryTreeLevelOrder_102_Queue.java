package LeetCode;

import java.util.*;

public class BinaryTreeLevelOrder_102_Queue {

    public List<List<Integer>> levelOrder(SameTree_100.TreeNode root){
    if(root == null) return new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();
    traverse(root,result);
    return result;
    }

    private void traverse(SameTree_100.TreeNode node, List<List<Integer>> list){
        Deque<SameTree_100.TreeNode> stack = new ArrayDeque<>();
        Deque<Integer> levels = new ArrayDeque<>();

        stack.push(node);
        levels.push(0);

        while(!stack.isEmpty()){
            SameTree_100.TreeNode current = stack.pop();
            int level = levels.pop();

            if(list.size() == level){
                list.add(new ArrayList<>());
            }
            list.get(level).add(current.val);

            if(current.right != null){
                stack.push(current.right);
                levels.push(level + 1);
            }
            if(current.left != null){
                stack.push(current.left);
                levels.push(level + 1);
            }

        }
    }
}
