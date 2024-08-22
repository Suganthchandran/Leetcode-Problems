class Solution {
    ListNode head;
    ListNode tail;

    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        head = null;
        tail = null;

        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                add(head1.val);
                head1 = head1.next;
            } else {
                add(head2.val);
                head2 = head2.next;
            }
        }

        while (head1 != null) {
            add(head1.val);
            head1 = head1.next;
        }

        while (head2 != null) {
            add(head2.val);
            head2 = head2.next;
        }

        return head;
    }

    public void add(int val) {
        ListNode new_node = new ListNode(val);
        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            tail.next = new_node;
            tail = new_node;
        }
    }
}
