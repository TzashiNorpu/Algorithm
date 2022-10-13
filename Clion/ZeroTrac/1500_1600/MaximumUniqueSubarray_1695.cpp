//
// Created by TzashiNorpu on 7/11/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

int MaximumUniqueSubarray_1695::maximumUniqueSubarray(vector<int> &nums) {
  unordered_map<int, int> w;
  int ans = 0, sum = 0;
  int l = 0, r = 0, n = nums.size();
  while (r < n) {
    int r_num = nums[r];
    if (w[r_num] == 0) {
      r++;
      w[r_num]++;
      sum += r_num;
      ans = max(ans, sum);
    } else {
      while (w[r_num] > 0) {
        int l_num = nums[l++];
        sum -= l_num;
        w[l_num]--;
      }
    }
  }
  return ans;
}
