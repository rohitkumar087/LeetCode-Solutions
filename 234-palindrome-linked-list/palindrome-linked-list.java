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

    ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    ListNode reverseList(ListNode head){
        ListNode forward = head;
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        
      ListNode middle = findMiddle(head);
      ListNode head2 = middle.next;
      middle.next = null;

      head2 = reverseList(head2);

      ListNode curr1 = head;
      ListNode curr2 = head2;

      while(curr2 != null){
        if(curr1.val != curr2.val){
            return false;
        }
        curr1 = curr1.next;
        curr2 = curr2.next;
      }

      return true;
    }
}