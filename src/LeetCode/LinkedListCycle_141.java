package LeetCode;

import java.util.HashSet;

public class LinkedListCycle_141 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public class Solution {
        public boolean hasCycle(ListNode head) {

            HashSet<ListNode> visited = new HashSet<ListNode>();

            ListNode current = head;

            while (current != null) {
                if(visited.contains(current)){
                return true;
                }else{
                    visited.add(current);
                }
                current = current.next;
            }
            return false;
        }
    }
}
