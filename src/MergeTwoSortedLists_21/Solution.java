package MergeTwoSortedLists_21;

public class Solution {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        // Создаём второй список: 4 -> 5 -> 6
        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(6);

        ListNode res = ListNode.mergeTwoLists(l1, l2);
        System.out.println(res);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }


        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode head = new ListNode(0);
            ListNode current = head;

            while (list1 != null && list2 != null) {

                if (list1.val < list2.val) {
                    current.next = new ListNode(list1.val);
                    list1 = list1.next;
                } else {
                    current.next = new ListNode(list2.val);
                    list2 = list2.next;
                }
                current = current.next;
            }

            if (list1 != null) current.next = list1;
            if (list2 != null) current.next = list2;
            return head.next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }


}
