//
// Created by TzashiNorpu on 2023/6/2.
//
#include "../../header/header.h"

using namespace labuladong;

void Solution::moveZeroes(vector<int> &nums) {
  int pos = 0;
  for (int i = 0; i < nums.size(); ++i) {
    if (nums[i] != 0) {
      nums[pos++] = nums[i];
      if (pos - 1 != i)
        nums[i] = 0;
    }
  }
}