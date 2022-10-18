//
// Created by TzashiNorpu on 10/18/2022.
//
#include "array_list.h"

using namespace Array_List;

int Solution::removeElement(vector<int> &nums, int val) {
  int fast = 0, slow = 0;
  while (fast < nums.size()) {
    if (nums[fast] != val) nums[slow] = nums[fast], slow++;
    fast++;
  }
  return slow;
}