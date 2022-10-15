//
// Created by TzashiNorpu on 7/13/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

int maxAbsoluteSum_1749::maxAbsoluteSum(vector<int> &nums) {
  int sum = 0, maxSum = 0, minSum = 0;
  for (int &num: nums) {
    sum += num;
    maxSum = max(maxSum, sum);
    minSum = min(minSum, sum);
  }
  return maxSum - minSum;
}
