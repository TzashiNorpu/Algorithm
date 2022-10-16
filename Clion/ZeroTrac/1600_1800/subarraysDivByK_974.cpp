//
// Created by TzashiNorpu on 9/30/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

int Solution::subarraysDivByK(vector<int> &nums, int k) {
  /*
   * Input: nums = [4,5,0,-2,-3,1], k = 5
   * Output: 7
   * Explanation: There are 7 subarrays with a sum divisible by k = 5:
   * [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
   */
  vector<int> count(k);
  count[0] = 1;
  int prefix = 0, res = 0;
  for (int num: nums) {
    // 防止负数和溢出
    prefix = (prefix + num % k + k) % k;
    res += count[prefix]++;
  }
  return res;
}