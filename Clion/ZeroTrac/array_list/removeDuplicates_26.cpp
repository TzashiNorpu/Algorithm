//
// Created by TzashiNorpu on 10/18/2022.
//
#include "array_list.h"

using namespace Array_List;

int Solution::removeDuplicates(vector<int> &nums) {
  int index = 0;
  for (int i = 1; i < nums.size(); ++i) {
    if (nums[index] != nums[i]) nums[++index] = nums[i];
  }
  return index + 1;
}