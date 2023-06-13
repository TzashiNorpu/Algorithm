//
// Created by TzashiNorpu on 2023/6/13.
//
#include "../header/header.h"

using namespace zero;

int Solution::numberOfSubarrays(vector<int> &nums, int k) {
  // [1{pos1},2,2,2,1{pos2},2,2,1{pos3},2,2,2{pos4},1]
  // pos1<->pos2的个数影响pos3<->pos4的元素
  int i = 0, j = 0, n = nums.size(), count = 0, res = 0;
  for (; j < n; j++) {
    if (nums[j] % 2 == 1) {
      k--;
      count = 0;
    }
    // pos3 stop
    while (k == 0) {
      if (nums[i++] % 2 == 1) k++;
      // pos1<->pos2的偶数个数
      count++;
    }
    res += count;
  }
  return res;
}