package lesson4.ClassWork;


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


    public ListNode reverseList(ListNode head) {
        ListNode pred = null;
        ListNode curr = head;

        while (curr!=null){
            ListNode next=curr.next;
            curr.next=pred;
            pred=curr;
            curr=next;
        }
        return pred;
    }

}
