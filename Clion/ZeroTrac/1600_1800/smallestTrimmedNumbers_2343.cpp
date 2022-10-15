//
// Created by TzashiNorpu on 9/6/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

vector<int> Solution::smallestTrimmedNumbers(vector<string> &nums, vector<vector<int>> &queries) {
  vector<int> res;
  int n = nums.size();
  for (auto &q: queries) {
    vector<pair<string, int>> pq;
    for (int i = 0; i < n; ++i) {
      pq.push_back({nums[i].substr(nums[i].size() - q[1]), i});
    }
    std::sort(pq.begin(), pq.end());
    res.push_back(pq[q[0] - 1].second);
  }
  return res;
}
