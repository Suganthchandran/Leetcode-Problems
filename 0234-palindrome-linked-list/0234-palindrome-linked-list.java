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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = reverse(slow);
        ListNode first = head;

        while(second!=null) {
            if(first.val != second.val) {
                return false;
            }
            first = first.next;
            second = second.next;
        }

        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode temp = head;
        ListNode prev = null,after=null;

        while(temp!=null) {
            after = temp.next;
            temp.next = prev;
            prev = temp;
            temp = after;
        }

        return prev;
    }
}