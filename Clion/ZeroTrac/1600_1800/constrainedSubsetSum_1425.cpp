//
// Created by TzashiNorpu on 10/8/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

int Solution::constrainedSubsetSum(vector<int> &nums, int k)
{
  /*
   * Input: nums = [-2,-10,6,-5,10,20], k = 2
   */
  deque<int> dq;
  int res = nums[0];
  int n = nums.size();
  vector<int> sum(n);
  for (int i = 0; i < n; ++i)
  {
    sum[i] = nums[i];
    if (!dq.empty())
      sum[i] += sum[dq.front()];
    res = max(res, sum[i]);
    if (!dq.empty() && dq.front() < (i - k + 1))
      dq.pop_front();
    while (!dq.empty() && sum[i] >= sum[dq.back()])
      dq.pop_back();
    if (sum[i] > 0)
      dq.push_back(i);
  }
  return res;
}
