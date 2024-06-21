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
    public ListNode deleteMiddle(ListNode head) {
      ListNode center = new ListNode(0, head);
      ListNode current = center, pointer = head;
      while (pointer != null && pointer.next != null) {
            current = current.next;
            pointer = pointer.next.next;
  }
        current.next = current.next.next;
        return center.next;
    }
}