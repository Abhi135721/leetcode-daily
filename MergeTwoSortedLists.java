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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        ListNode dummy = new ListNode(0); 
        ListNode res = dummy;
        while(true){
            if (cur1 == null) {
                res.next = cur2;
                break;
            }
            if (cur2 == null) {
                res.next = cur1;
                break;
            }
            if(cur1.val <= cur2.val){
                res.next = cur1;
                cur1 = cur1.next;
            }
            else{
                res.next = cur2;
                cur2 = cur2.next;
            }
            res = res.next;
        }
        return dummy.next;
    }
}