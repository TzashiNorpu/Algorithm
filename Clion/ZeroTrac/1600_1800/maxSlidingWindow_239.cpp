//
// Created by TzashiNorpu on 10/8/2022.
//
#include "header.h"

using namespace ZeroTrac;

vector<int> Solution::maxSlidingWindow(vector<int> &nums, int k) {
  deque<int> dq;
  int n = nums.size();
  vector<int> res(n - k + 1);
  for (int i = 0; i < n; ++i) {
    while (!dq.empty() && nums[dq.back()] <= nums[i]) dq.pop_back();
    dq.push_back(i);
    if (i - k >= dq.front()) dq.pop_front();
    if (i - k + 1 >= 0) res[i - k + 1] = nums[dq.front()];
  }
  return res;
}