package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeInorderTraversal_94 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
        }
    }

    class Solution {
        public List<Integer> inorderTraversal(TreeNode node) {
            List<Integer> result = new ArrayList<>();

            if (node == null) return result;

            result.addAll(inorderTraversal(node.left));
            result.add(node.val);
            result.addAll(inorderTraversal(node.right));

            return result;
        }

        public List<Integer> inorderTraversal_2(TreeNode node) {
            List<Integer> result = new ArrayList();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode current = node;

            while (current != null || stack.isEmpty()) {
                while (current != null) {
                    stack.push(current);
                    current = current.left;
                }

                current = stack.pop();
                result.add(current.val);
                current = current.right;
            }
            return result;
        }
    }

    public static void main(String[] args) {

    }
}
