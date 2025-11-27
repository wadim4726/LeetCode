
package ListNode;

public class ListNode {
    public static void main(String[] args) {
        // Создаем список: 1 -> 2 -> null
        ListNode2 l3 = new ListNode2(3,null);
        ListNode2 l2 = new ListNode2(4, l3);
        ListNode2 l1 = new ListNode2(2, l2);

        ListNode2 j3 = new ListNode2(4,null);
        ListNode2 j2 = new ListNode2(6, j3);
        ListNode2 j1 = new ListNode2(5, j2);


        Solution solution = new Solution();
        ListNode2 result = solution.addTwoNumbers(l1, j1);

        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}

// Класс узла
class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2() {}

    ListNode2(int val) {
        this.val = val;
    }

    ListNode2(int val, ListNode2 next) {
        this.val = val;
        this.next = next;
    }
}

// Класс решения
class Solution {

    public ListNode2 addTwoNumbers(ListNode2 l1, ListNode2 l2) {


        ListNode2 emptyListNode = new ListNode2(0);
        ListNode2 current = emptyListNode;

        while(l1 != null || l2!= null){

        int b = l1.val + l2.val;
        current.next = new ListNode2(b);
        current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return emptyListNode.next;
    }
}








