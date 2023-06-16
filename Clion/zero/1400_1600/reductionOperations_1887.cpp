//
// Created by TzashiNorpu on 2023/6/16.
//
#include "../header/header.h"

using namespace zero;

int Solution::reductionOperations(vector<int> &nums) {
  std::sort(nums.begin(), nums.end());
  vector<int> v;
  int n = nums.size();
  int mi = nums[0];
  for (int i = n - 1; i >= 0;) {
    int count = 0;
    int tmp = nums[i];
    while (i >= 0 && nums[i] == tmp) {
      count++;
      i--;
    }
    v.push_back(count);
  }
  int res = 0;
  int m = v.size();
  //printf("m=%d\n",m);
  for (int i = 0; i < m - 1; ++i) {
    res += v[i];
    v[i + 1] += v[i];
  }
  return res;

  /*int res = 0, sz = n.size();
  sort(begin(n), end(n));
  for (int j = sz - 1; j > 0; --j)
    if (n[j - 1] != n[j])
      res += sz - j;
  return res;*/
}