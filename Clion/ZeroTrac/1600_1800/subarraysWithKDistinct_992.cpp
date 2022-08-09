#include "header.h"

using namespace ZeroTrac;

int atMostK(vector<int> &A, int K) {
  int i = 0, res = 0;
  unordered_map<int, int> count;
  for (int j = 0; j < A.size(); ++j) {
    // count[A[j]]==0 时进入 if
    if (!count[A[j]]++) K--;
    while (K < 0) {
      // count[A[i]]==0 时进入 if
      if (!--count[A[i]]) K++;
      i++;
    }
    res += j - i + 1;
  }
  return res;
}

int Solution::subarraysWithKDistinct_992(vector<int> &nums, int k) {
  return atMostK(nums, k) - atMostK(nums, k - 1);
}