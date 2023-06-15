//
// Created by TzashiNorpu on 2023/6/15.
//
#include "../header/header.h"

using namespace zero;

string Solution::customSortString(string order, string s) {
  /*unordered_map<char, string> count;
  for (auto &x: s) count[x] += x;
  string res;
  for (auto &x: order) {
    if (count.find(x) != count.end()) {
      res += count[x];
      count.erase(x);
    }
  }
  for (auto &x: count) {
    res += x.second;
  }
  return res;*/
  std::sort(s.begin(), s.end(), [&](auto &a, auto &b) { return order.find(a) < order.find(b); });
  return s;
}