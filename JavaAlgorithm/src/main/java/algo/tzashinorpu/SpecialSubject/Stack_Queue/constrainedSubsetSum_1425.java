package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class constrainedSubsetSum_1425 {
    public int constrainedSubsetSum(int[] nums, int k) {
        /*
        Input: nums = [10,2,-10,5,20], k = 2
        Output: 37
        Explanation: The subsequence is [10, 2, 5, 20]
         */
        // A[i] = max(0, A[i - k], A[i - k + 1],..,A[i - 1])+A[i] -> dp[i] = max(0, dp[i - k], dp[i - k + 1], .., dp[i -1]) + A[i]
        // `deque` stores dp[i - k], dp[i-k+1], .., dp[i - 1] whose values are larger than 0 in a decreasing order
        int res = nums[0];
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < nums.length; ++i) {
            // deque[0] is the max of (0, dp[i - k], dp[i-k+1], .., dp[i - 1])
            nums[i] += !q.isEmpty() ? q.peek() : 0;
            res = Math.max(res, nums[i]);
            // We always want to retrieve the max of (0, dp[i - k], dp[i-k+1], .., dp[i - 1]) from `deque`
            // We expect dp[i] to be added to `deque` so that we can compute dp[i + 1] in the next iteration
            // So, if dp[i] is larger than some old values, we can discard them safely.
            // As a result, the length of `deque` is not necessarily `k`
            while (!q.isEmpty() && nums[i] > q.peekLast())
                q.pollLast();
            // no need to store the negative value
            if (nums[i] > 0)
                q.offer(nums[i]);
            // we do not need the value of A[i - k] when computing dp[i+1] in the next iteration, because `j - i <= k` has to be satisfied.
            if (i >= k && !q.isEmpty() && q.peek() == nums[i - k])
                q.poll();
        }
        return res;
    }
}
