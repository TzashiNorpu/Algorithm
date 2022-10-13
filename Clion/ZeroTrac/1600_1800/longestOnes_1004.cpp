//
// Created by TzashiNorpu on 9/6/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

int Solution::longestOnes(vector<int> &nums, int k) {
  /*Find the longest subarray with at most K zeros.
   * For each A[j], try to find the longest subarray.
   * If A[i] ~ A[j] has zeros <= K, we continue to increment j.
   * If A[i] ~ A[j] has zeros > K, we increment i (as well as j).*/
  int i = 0, j;
  for (j = 0; j < nums.size(); ++j) {
    if (nums[j] == 0) k--;
    if (k < 0 && nums[i++] == 0) k++;
  }
  return j - i;
}