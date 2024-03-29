//
// Created by TzashiNorpu on 7/6/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

bool CheckPowersOfThree::checkPowersOfThree(int n) {
  vector<int> vec;
  for (int i = 0; i <= 15; i++) {
    vec.push_back(pow(3, i));
  }
  return helper(0, n, 0, vec);
}

bool CheckPowersOfThree::helper(int sum, int n, int chooseIdx, vector<int> nums) {
  if (chooseIdx == nums.size()) return false;
  if (sum > n) return false;
  if (sum == n) return true;
  return helper(sum + nums[chooseIdx], n, chooseIdx + 1, nums) || helper(sum, n, chooseIdx + 1, nums);
}

