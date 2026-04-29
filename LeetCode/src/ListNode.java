/*
 * @lc app=leetcode id=92 lang=java
 *
 * [92] Reverse Linked List II
 *
 * https://leetcode.com/problems/reverse-linked-list-ii/description/
 *
 * algorithms
 * Medium (51.37%)
 * Likes:    12972
 * Dislikes: 788
 * Total Accepted:    1.3M
 * Total Submissions: 2.6M
 * Testcase Example:  '[1,2,3,4,5]\n2\n4'
 *
 * Given the head of a singly linked list and two integers left and right where
 * left <= right, reverse the nodes of the list from position left to position
 * right, and return the reversed list.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: head = [1,2,3,4,5], left = 2, right = 4
 * Output: [1,4,3,2,5]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: head = [5], left = 1, right = 1
 * Output: [5]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * The number of nodes in the list is n.
 * 1 <= n <= 500
 * -500 <= Node.val <= 500
 * 1 <= left <= right <= n
 * 
 * 
 * 
 * Follow up: Could you do it in one pass?
 */

// @lc code=start

// public class ListNode {
//       int val;
//       ListNode next;
//       ListNode() {}
//       ListNode(int val) { this.val = val; }
//       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }
 
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode curr = head;
        ListNode prev = null;

        int count = 1;

        ListNode beforeLeft = null;
        ListNode leftNode = null;

        while (curr != null) {
            if (count == left) {
                beforeLeft = prev;
                leftNode = curr;
            }

            if (count >= left && count <= right) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            } else {
                prev = curr;
                curr = curr.next;
            }

            if (count == right) break;

            count++;
        }

        // reconnect
        if (beforeLeft != null) {
            beforeLeft.next = prev;
        } else {
            head = prev;
        }

        leftNode.next = curr;

        return head;


    }
}
// @lc code=end

