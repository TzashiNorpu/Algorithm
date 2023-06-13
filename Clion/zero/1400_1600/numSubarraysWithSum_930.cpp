//
// Created by TzashiNorpu on 2023/6/13.
//
#include "../header/header.h"

using namespace zero;

int Solution::numSubarraysWithSum(vector<int> &nums, int goal) {
  int n = nums.size();
  function<int(int)> mostK = [&](int K) -> int {
      if (K < 0)return 0;
      int count = 0, i = 0, j = 0;
      for (; j < n; j++) {
        K -= nums[j];
        while (K < 0)
          K += nums[i++];
        //printf("i=%d,j=%d\n", i, j);
        count += (j - i + 1);
      }
      //printf("---count=%d\n", count);
      return count;
  };
  return mostK(goal) - mostK(goal - 1);
}