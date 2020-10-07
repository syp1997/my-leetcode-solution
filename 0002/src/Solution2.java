public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, s = dummyHead;
        int carry = 0;

        while (p!=null || q!=null){
            int x = p==null? 0 : p.val;
            int y = q==null? 0 : q.val;

            int sum = carry + x + y;
            s.next = new ListNode(sum % 10);
            carry = sum>9? 1 : 0;

            s = s.next;
            if(p!= null){p = p.next;}
            if(q!= null){q = q.next;}

        }
        if(carry > 0){
            s.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

}
