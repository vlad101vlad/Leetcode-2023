package p02_AddTwoNumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListNodeTest {
    private ListNode l1;
    private ListNode l2;

    private ListNode expected;

    @Test
    void example1(){
        l1 = buildListNode(new int[]{2,4,3});
        l2 = buildListNode(new int[]{5,6,4});

        expected = buildListNode(new int[]{7, 0, 8});

        Assertions.assertTrue(checkListEquality(expected, ListNode.addTwoNumbers(l1, l2)));
    }

    @Test
    void example2(){
        l1 = buildListNode(new int[]{0});
        l2 = buildListNode(new int[]{0});

        expected = buildListNode(new int[]{0});

        Assertions.assertTrue(checkListEquality(expected, ListNode.addTwoNumbers(l1, l2)));
    }

    @Test
    void example3(){
        l1 = buildListNode(new int[]{9,9,9,9,9,9,9});
        l2 = buildListNode(new int[]{9,9,9,9});

        expected = buildListNode(new int[]{8,9,9,9,0,0,0,1});

        Assertions.assertTrue(checkListEquality(expected, ListNode.addTwoNumbers(l1, l2)));
    }


    private ListNode buildListNode(int[] someArray){
        ListNode toReturn = new ListNode();
        ListNode currentNode = toReturn;
        for(int currentNum: someArray){
            ListNode newNode = new ListNode(currentNum);
            currentNode.next = newNode;
            currentNode = newNode;
        }
        toReturn = toReturn.next;
        return toReturn;
    }

    private boolean checkListEquality(ListNode l1, ListNode l2){
        boolean oneIteration = false;
        while(l1.next != null && l2.next != null)
            if(l1.val == l2.val){
                l1 = l1.next;
                l2 = l2.next;
                oneIteration = true;
            } else {
                return false;
            }
        return oneIteration;
    }
}
