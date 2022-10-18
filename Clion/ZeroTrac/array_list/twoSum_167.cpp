//
// Created by TzashiNorpu on 10/18/2022.
//
#include "array_list.h"

using namespace Array_List;

vector<int> Solution::twoSum(vector<int> &numbers, int target) {
  int l = 0, r = numbers.size() - 1;
  while (l < r) {
    int sum = numbers[l] + numbers[r];
    if (sum > target) r--;
    else if (sum < target) l++;
    else return {l, r};
  }
  return {-1, -1};
}