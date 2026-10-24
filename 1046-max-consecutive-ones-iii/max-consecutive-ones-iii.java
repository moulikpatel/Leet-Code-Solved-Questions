class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0;
        int n = nums.length;
        int zeros = 0;
        int Max = 0;

        while (j < n) {
            if (nums[j] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if (nums[i] == 0) {
                    zeros--;
                }
                i++;
            }

            Max = Math.max(Max, j - i + 1);
            j++;
        }

        return Max;
    }
}