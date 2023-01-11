package p02_AddTwoNumbers;

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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        // Case 0
        if(l1.val == 0 && l1.next == null)
            return l2;
        if(l2.val == 0 && l2.next == null)
            return l1;

        return doSums(l1, l2, 0);
    }

    public static ListNode doSums(ListNode l1, ListNode l2, int prevRemainder){
        if(l1 == null && l2 == null){
            if(prevRemainder > 0)
                return new ListNode(1);
            return null;
        }

        int remainder = 0;
        int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + prevRemainder;
        if(sum >= 10) {
            sum -= 10;
            remainder += 1;
        }

        ListNode nextL1 = l1 != null ? l1.next : null;
        ListNode nextL2 = l2 != null ? l2.next : null;

        return new ListNode(sum, doSums(nextL1, nextL2, remainder));
    }
}
