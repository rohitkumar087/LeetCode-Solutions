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
    int length(ListNode head,int n){
        ListNode curr = head;
        int count = 0;

        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count-n;
    }

    ListNode deletionAtHead(ListNode head){
      if(head == null){
        return null;
      }
     
      head = head.next;
     
      return head;
    }

     ListNode deletionAtGivenPos(ListNode head, int pos){
      if(pos == 0){
        return deletionAtHead(head);
      }
      if(head.next == null){
        return head;
      }
     
      ListNode curr = head;
     
      while(pos > 1){
        curr = curr.next;
        pos--;
      }
     
      curr.next = curr.next.next;
     
      return head;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int pos = length(head,n);
        
        head = deletionAtGivenPos(head, pos); 

        return head;

    }
}