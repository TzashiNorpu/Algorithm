//
// Created by TzashiNorpu on 8/15/2022.
//
#include "header.h"

using namespace ZeroTrac;

int Solution::maximumCandies(vector<int> &candies, long long k) {
  int left = 0, right = 1e7;
  while (left < right) {
    long sum = 0, mid = (left + right + 1) / 2;
    for (int &a: candies) {
      sum += a / mid;
    }
    if (k > sum)
      right = mid - 1;
    else
      left = mid;
  }
  return left;
}