//
// Created by TzashiNorpu on 9/6/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

int Solution::minDifference(vector<int> &nums) {
  // [82,81,95,75,20] -> [82,81,82,82,81]
  /*4 plans:
  kill 3 biggest elements
  kill 2 biggest elements + 1 smallest elements
  kill 1 biggest elements + 2 smallest elements
  kill 3 smallest elements*/
  int n = nums.size();
  if (n < 5) return 0;
  sort(nums.begin(), nums.end());
  // nums[n - 1] - nums[3] -> kill 3 smallest elements
  return min({nums[n - 1] - nums[3], nums[n - 2] - nums[2], nums[n - 3] - nums[1], nums[n - 4] - nums[0]});
}