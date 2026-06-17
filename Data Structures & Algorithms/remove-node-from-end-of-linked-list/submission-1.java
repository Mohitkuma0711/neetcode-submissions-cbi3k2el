/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
  // public int length(ListNode head) {
  //  int count = 0;
    //ListNode curr = head;

    //while (curr != null) {
      ///  count++;
        //curr = curr.next;
    //}

    //return count;
//}
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode c = head;
        int count =0;
        if(head==null){
    return null;
    
}


    while (curr != null) {
        count++;
        curr = curr.next;
    }
     if (count == n) {
            return head.next;
        }

        for (int i = 1; i < count - n; i++) {
            c = c.next;
        }

        c.next = c.next.next;

        return head;
    }
}