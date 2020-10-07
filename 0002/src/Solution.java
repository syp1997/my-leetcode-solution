/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode l3 = head;

        while (l1!=null){
            l3.val += l1.val+l2.val;
            if(l3.val > 9){
                l3.next = new ListNode(1);
                l3.val = l3.val - 10;
            }
            else if(l1.next != null || l2.next != null){
                l3.next = new ListNode(0);
            }
            l1 = l1.next;
            l2 = l2.next;
            l3 = l3.next;
            if(l1 == null && l2 != null){
                l1 = new ListNode(0);
            }
            if(l2 == null && l1 != null){
                l2 = new ListNode(0);
            }
        }
        return head;
    }
}