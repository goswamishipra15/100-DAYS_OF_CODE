Problem Statement URL:https://leetcode.com/problems/intersection-of-two-linked-lists/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null && headB==null){
            return null;
        }
        ListNode list1=headA;
        ListNode list2=headB;
        while(list1!=list2){
            if(list1==null){
                list1=headB;
            }
            else{
                list1=list1.next;
            }
            if(list2==null){
                list2=headA;
            }
            else{
                list2=list2.next;
            }
        }
        return list1;
    }
}
