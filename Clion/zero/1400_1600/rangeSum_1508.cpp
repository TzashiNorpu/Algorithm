//
// Created by TzashiNorpu on 2023/6/6.
//
#include "../header/header.h"

using namespace zero;

int Solution::rangeSum(vector<int> &nums, int n, int left, int right) {
  vector<int> sum_v;
  for (int i = 0; i < n; ++i) {
    vector<int> tmp;
    tmp.push_back(nums[i]);
    for (int j = i + 1; j < n; ++j) {
      tmp.push_back(tmp[tmp.size() - 1] + nums[j]);
    }
    //for(auto x : tmp) printf("x=%d\n",x);
    sum_v.insert(sum_v.begin(), tmp.begin(), tmp.end());
  }
  std::sort(sum_v.begin(), sum_v.end());
  int res = 0;
  for (int i = left - 1; i <= right - 1; ++i) {
    res = (res + sum_v[i]) % (10 ^ 9 + 7);
  }
  return res;
}