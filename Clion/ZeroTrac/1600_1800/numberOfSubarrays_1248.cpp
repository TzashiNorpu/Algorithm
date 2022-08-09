#include "header.h"

using namespace ZeroTrac;

int atMost(vector<int> &A, int k) {
  int res = 0, i = 0;
  for (int j = 0; j < A.size(); j++) {
    k -= (A[j] % 2);
    while (k < 0) k += (A[i++] % 2);
    res += j - i + 1;
  }
  return res;
}

int Solution::numberOfSubarrays_1248(vector<int> &nums, int k) {
  return atMost(nums, k) - atMost(nums, k - 1);
}

int Solution::numberOfSubarraysWithK(vector<int> &nums, int k) {
  for (int &num: nums) num &= 1;
  unordered_map<int, int> map;
  map[0] = 1;
  int res = 0;
  int sum = 0;
  for (int num: nums) {
    sum += num;
    if (map.count(sum - k)) res += map[sum - k];
    map[sum]++;
  }
  return res;
}