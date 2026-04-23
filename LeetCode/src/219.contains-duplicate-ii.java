/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 *
 * https://leetcode.com/problems/contains-duplicate-ii/description/
 *
 * algorithms
 * Easy (51.13%)
 * Likes:    7523
 * Dislikes: 3327
 * Total Accepted:    1.8M
 * Total Submissions: 3.4M
 * Testcase Example:  '[1,2,3,1]\n3'
 *
 * Given an integer array nums and an integer k, return true if there are two
 * distinct indices i and j in the array such that nums[i] == nums[j] and abs(i
 * - j) <= k.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 * 0 <= k <= 10^5
 * 
 * 
 */

// @lc code=start

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        while (i < nums.length - 1) {
            int j = i + 1;
            while (j < nums.length && j <= i + k) {
                if (nums[i] == nums[j]) {
                    return true;  // ✅ fixed
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
// @lc code=end

