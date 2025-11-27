package LeetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SymmetricTreeArrayList {

    public boolean isSymmetric(SameTree_100.TreeNode root){
        ArrayList<String> inOrder = inOrderTravelsal(root.left);
        ArrayList<String> reverseInOrder = ReverseInOrderTravelsal(root.right);
        return inOrder.equals(reverseInOrder);
    }

    private ArrayList<String> inOrderTravelsal(SameTree_100.TreeNode root) {
        ArrayList<String> result = new ArrayList<>();
        SameTree_100.TreeNode current = root;
        Deque<SameTree_100.TreeNode> stack = new ArrayDeque<>();

        while (current != null || !stack.isEmpty()) {
            while(current != null){
                stack.addLast(current);
                current = current.left;
            }
            SameTree_100.TreeNode node = stack.removeLast();
            result.add(String.valueOf(node.val));
            if (node.left == null) result.add("null");
            if (node.right == null) result.add("null");
            current = node.right;
        }
        return result;
    }
    private ArrayList<String> ReverseInOrderTravelsal(SameTree_100.TreeNode root){
        ArrayList<String> result = new ArrayList<>();
        SameTree_100.TreeNode current = root;
        Deque<SameTree_100.TreeNode> stack = new ArrayDeque<>();

        while (current != null || !stack.isEmpty()) {
            while(current != null){
                stack.addLast(current);
                current = current.right;
            }
            SameTree_100.TreeNode node = stack.removeLast();
            result.add(String.valueOf(node.val));
            if (node.right == null) result.add("null");
            if (node.left == null) result.add("null");
            current = node.left;
        }
        return result;

    }

    }

