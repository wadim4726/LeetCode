package LeetCode;

public class RemoveDuplicatesFromSortedList_83 {

    public class ListNode {
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
    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

          while(current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
          }
          return head;
    }


    public static void main(String[] args) {

    }
}
