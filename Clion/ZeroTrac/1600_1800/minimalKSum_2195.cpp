//
// Created by TzashiNorpu on 10/10/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

long long Solution::minimalKSum(vector<int> &nums, int k) {
  sort(nums.begin(), nums.end());
  long long s = 0;
  long i = 0;
  int prev = 0;
  int n = nums.size();
  while (k > 0 && i < n) {
    int len = nums[i] - prev - 1;
    if (len > k) len = k;
    if (len > 0) {
      long long int start = prev;
      long long int end = start + len;
      long long int sum = end * (end + 1) / 2 - start * (start + 1) / 2;
      s += sum;
      k -= len;
    }
    prev = nums[i], i++;
  }
  if (k > 0) {
    long long int start = prev;
    long long int end = start + k;
    long long int sum = end * (end + 1) / 2 - start * (start + 1) / 2;
    s += sum;
  }
  return s;
}