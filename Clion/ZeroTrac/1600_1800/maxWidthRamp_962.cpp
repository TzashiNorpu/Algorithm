//
// Created by TzashiNorpu on 7/27/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

// 维护递减栈  递增时二分搜索栈 找到第一个【最底部】<= 当前元素的位置
int Solution::maxWidthRamp_962(vector<int> &nums) {
  vector<int> stack;
  int res = 0;
  for (int i = 0; i < nums.size(); ++i) {
    if (stack.size() == 0 || nums[i] < nums[stack.back()]) {
      stack.push_back(i);
    } else {
      int l = 0, r = stack.size() - 1, mid = 0;
      while (l < r) {
        mid = (l + r) / 2;
        if (nums[stack[mid]] <= nums[i]) r = mid;
        else l = mid + 1;
      }
      res = max(res, i - stack[l]);
    }
  }
  return res;
}