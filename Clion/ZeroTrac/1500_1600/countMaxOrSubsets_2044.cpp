//
// Created by TzashiNorpu on 7/20/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

void countMaxOrSubsets_2044::helper(int m, int n, int index, vector<int> &nums) {
  if (index == nums.size()) {
    if (n == m) {
      res++;
    }
    return;
  }
  helper(m, n, index + 1, nums);
  helper(m, n | nums[index], index + 1, nums);
}

int countMaxOrSubsets_2044::countMaxOrSubsets(vector<int> &nums) {
  int m_or = 0;
  for (auto num: nums) m_or |= num;
  helper(m_or, 0, 0, nums);
  return res;
}

int countMaxOrSubsetsDfs(vector<int> &nums) {
  int max = 0, dp[1 << 17] = {1};
  for (int num: nums) {
    for (int i = max; i >= 0; i--) {
      dp[i | num] += dp[i];
    }
    max |= num;
  }
  return dp[max];
}