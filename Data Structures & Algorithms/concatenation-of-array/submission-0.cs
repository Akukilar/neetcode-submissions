public class Solution {
    public int[] GetConcatenation(int[] nums) {
        int n = nums.Length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = ans[i + n] = nums[i];
        }
        return ans;
    }
}

// create an array 'ans' length 2n where 'ans[i] == nums[i]' and ans[i + n] == nums[i]
// 'ans' is concat of 2 'nums' array
// return 'ans'
