//
// Created by TzashiNorpu on 2023/6/19.
//
#include "../header/header.h"

using namespace zero;

int Solution::minElements(vector<int> &nums, int limit, int goal) {
  long sum = accumulate(nums.begin(), nums.end(), 0L), diff = abs(goal - sum);
  return (diff + limit - 1) / limit;
}