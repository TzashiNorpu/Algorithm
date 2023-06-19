//
// Created by TzashiNorpu on 2023/6/19.
//
#include "../header/header.h"

using namespace zero;

vector<int> Solution::frequencySort(vector<int> &nums) {
  unordered_map<int, int> count;
  for (auto x: nums) {
    count[x]++;
  }
  // 降序
  auto cmp = [&count](int a, int b) {
      if (count[a] == count[b]) return a < b;
      return count[a] > count[b];
  };
  // 小顶堆
  priority_queue<int, vector<int>, decltype(cmp)> pq(cmp);
  for (auto &x: nums) {
    pq.push(x);
  }

  vector<int> res;
  while (!pq.empty()) {
    res.push_back(pq.top());
    pq.pop();
  }
  return res;
}