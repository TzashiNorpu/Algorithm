//
// Created by TzashiNorpu on 2023/6/13.
//
#include "../header/header.h"

using namespace zero;

int Solution::subarraysWithKDistinct(vector<int> &nums, int k) {
  int n = nums.size();
  function<int(int)> mostK = [&](int K) -> int {
      int res = 0;
      unordered_map<int, int> count;
      int i = 0, j = 0;
      for (; j < n; ++j) {
        // 第一个遇见该数字时K--
        if (!(count[nums[j]]++)) K--;
        while (K < 0)
          // 该数字在区间内没有了时K++
          if (!(--count[nums[i++]])) K++;
        res += (j - i + 1);
      }
      return res;
  };
  return mostK(k) - mostK(k - 1);
}