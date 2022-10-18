//
// Created by TzashiNorpu on 10/18/2022.
//
#include "array_list.h"

using namespace Array_List;

void Solution::moveZeroes(vector<int> &nums) {
  int slow = 0, fast = 0;
  while (fast < nums.size()) {
    if (nums[fast] != 0) {
      nums[slow] = nums[fast];
      if (slow != fast)nums[fast] = 0;
      slow++;
    }
    fast++;
  }
}