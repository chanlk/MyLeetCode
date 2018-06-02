package likedlist;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.  Example 1:  Input: 1->1->2 Output: 1->2 Example 2:  Input: 1->1->2->3->3 Output: 1->2->3
 *
 * @author Chanlk
 * Create 18/6/2
 */


public class _83RemoveDuplicatefromSortedList {
    public static void main(String[] argus){
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        ListNode p = head.next.next;
        for(int i = 0;i < 100000;i++){
            p.next = new ListNode(3);
            p = p.next;
        }
        _83RemoveDuplicatefromSortedList removeDuplicatefromSortedList = new _83RemoveDuplicatefromSortedList();
        removeDuplicatefromSortedList.deleteDuplicates(head);
        System.out.println("2");
    }
//    public ListNode deleteDuplicates(ListNode head) {
//        if(head == null) return null;
//        ListNode p = head;
//        while(p != null){
//            if(p.next == null)   break;
//
//            ListNode t = p.next;
//            while(p.val == t.val){
//                t = t.next;
//                if (t == null){
//                    p.next = null;
//                    break;
//                }
//            }
//            p.next = t;
//            p = p.next;
//        }
//        return head;
//    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
    }
}
