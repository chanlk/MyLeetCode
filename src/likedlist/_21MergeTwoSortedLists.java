package likedlist;

/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 * Example:  Input: 1->2->4, 1->3->4 Output: 1->1->2->3->4->4
 *
 * @author Chanlk
 * Create 18/6/2
 */




public class _21MergeTwoSortedLists {

    public static void main(String[] argus){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        _21MergeTwoSortedLists mergeTwoSortedLists = new _21MergeTwoSortedLists();
        mergeTwoSortedLists.mergeTwoLists(l1,l2);
    }

        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode temp1 = l1;//l1指针
            ListNode temp2 = l2;//l2指针
            int begin = l1.val < l2.val? l1.val:l2.val;
            if (begin == l1.val)
                temp1 = temp1.next;
            else temp2 = temp2.next;

            ListNode res = new ListNode(begin);
            ListNode temp3 = res;

            while(temp1 != null || temp2 != null){

                if( temp1.val == temp2.val){
                    temp3.next = new ListNode(temp2.val);
                    temp3.next.next= new ListNode(temp2.val);
                    temp3 = temp3.next.next;
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                }
                else if(temp1.val < temp2.val){
                    temp3.next = new ListNode(temp1.val);
                    temp3 = temp3.next;
                    temp1 = temp1.next;
                }
                else {
                    temp3.next = new ListNode(temp2.val);
                    temp3 = temp3.next;
                    temp2 = temp2.next;
                }
            }

            if(temp1 != null){
                temp3.next = temp1;
            }
            if (temp2 != null)
                temp3.next = temp2;

            return res;

        }

}
