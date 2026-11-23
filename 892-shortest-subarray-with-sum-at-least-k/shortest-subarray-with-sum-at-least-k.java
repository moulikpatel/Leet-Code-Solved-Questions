
class Solution {
    public int shortestSubarray(int[] nums, int k) {

        int n = nums.length;

        // Step 1: Calculate prefix sum
        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        // Step 2: Create deque
        Deque<Integer> dq = new ArrayDeque<>();

        int ans = n + 1;

        // Step 3: Traverse prefix array
        for (int i = 0; i <= n; i++) {

            // Condition 1: Find valid subarray
            while (!dq.isEmpty() &&
                   prefix[i] - prefix[dq.peekFirst()] >= k) {

                ans = Math.min(ans, i - dq.pollFirst());
            }

            // Condition 2: Maintain increasing prefix sums
            while (!dq.isEmpty() &&
                   prefix[i] <= prefix[dq.peekLast()]) {

                dq.pollLast();
            }

            // Add current index
            dq.offerLast(i);
        }

        return ans == n + 1 ? -1 : ans;
    }
}
