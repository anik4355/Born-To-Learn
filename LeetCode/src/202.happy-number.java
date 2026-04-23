
import java.util.HashSet;

/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 *
 * https://leetcode.com/problems/happy-number/description/
 *
 * algorithms
 * Easy (59.53%)
 * Likes:    11962
 * Dislikes: 1646
 * Total Accepted:    2.3M
 * Total Submissions: 3.8M
 * Testcase Example:  '19'
 *
 * Write an algorithm to determine if a number n is happy.
 * 
 * A happy number is a number defined by the following process:
 * 
 * 
 * Starting with any positive integer, replace the number by the sum of the
 * squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it
 * loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * 
 * 
 * Return true if n is a happy number, and false if not.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: n = 19
 * Output: true
 * Explanation:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: n = 2
 * Output: false
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= n <= 2^31 - 1
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        int num = n;
        HashSet<Integer> visited = new HashSet<>();
        while(num != 1){
            if(visited.contains(num)){
                return false;
            }
            visited.add(num);
            num = boolHappy(num);
        }
        return true;
    }
    public static int boolHappy(int num){
        int p = num;
        long sum = 0;
        while(p>0){
            int d = p%10;
            sum += d * d;
            p = p / 10;
        }
        return (int)sum;
    }
}
// @lc code=end

