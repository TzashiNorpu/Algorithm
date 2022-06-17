#include "ss.h"
#include <math.h>
int myAlgo::TotalSteps_2289::totalSteps(vector<int>& nums)
{
    int res = 0, n = nums.size(), j = -1;
    vector<int> stack(n), dp(n);
    for (int i = n - 1; i >= 0; i--)
    {
        while (j >= 0 && nums[i] > nums[stack[j]])
        {
            dp[i] = max(++dp[i], dp[stack[j--]]);
            res = max(res, dp[i]);
        }
        stack[++j] = i;
    }
    return res;
}