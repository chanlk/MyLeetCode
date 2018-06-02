package list;

import com.sun.tools.javac.util.List;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * @author Chanlk
 * Create 1/21/18
 */
class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int[] a1 = new int[30];
        int[] a2 = new int[30];
        int idx1 = 29 ,idx2 = 29,tidx1 = 29,tidx2 = 29;
        int val1  = 0,val2 = 0,sum = 0 ;

        while(true){
            a1[idx1--] = l1.val;
            l1 = l1.next;
            if (l1 == null) break;
            if(l1.next == null){
                a1[idx1--] = l1.val;
                break;
            }
        }
        while(true){
            a2[idx2--] = l2.val;
            l2 = l2.next;
            if (l2 == null) break;
            if(l2.next == null){
                a2[idx2--] = l2.val;
                break;
            }
        }
        int length1 = 29 - idx1 +1;

        while(true){
            if(tidx1 == idx1) break;
            val1 += a1[tidx1]*(Math.pow(10,29-tidx1));
            tidx1 -- ;

        }
        while(true){
            if(tidx2 == idx2) break;
            val2 += a2[tidx2]*(Math.pow(10,29-tidx2));
            tidx2 --;
        }
        sum = val1 + val2;

        ListNode res = new ListNode(sum % 10);
        ListNode cur = res;
        sum /= 10;

        while(sum != 0){
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            sum /= 10;
        }
        return res;
    }

    public static void main(String[] argus){
        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode listNode = addTwoNumbers.addTwoNumbers(l1, l2);
        System.out.println(listNode);
    }
}
