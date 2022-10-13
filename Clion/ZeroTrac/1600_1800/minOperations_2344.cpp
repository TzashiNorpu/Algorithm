//
// Created by TzashiNorpu on 8/12/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

inline int gcd(int a, int b) {
  while (b ^= a ^= b ^= a %= b);
  return a;
}

int Solution::minOperations(vector<int> &nums, vector<int> &numsDivide) {
  int g = numsDivide[0];
  for (int a: numsDivide)
    g = gcd(g, a);
  sort(nums.begin(), nums.end());
  for (int i = 0; i < nums.size() && nums[i] <= g; ++i)
    if (g % nums[i] == 0)
      return i;
  return -1;
}

