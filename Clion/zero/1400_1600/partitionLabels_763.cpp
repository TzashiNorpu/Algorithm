//
// Created by TzashiNorpu on 2023/6/27.
//
#include "../header/header.h"

using namespace zero;

vector<int> Solution::partitionLabels(string s) {
  int count[26];
  int n = s.size();
  for (int i = 0; i < n; ++i) {
    count[s[i] - 'a'] = i;
  }
  int mx = 0, prev = -1;
  vector<int> res;
  for (int i = 0; i < n; ++i) {
    mx = max(mx, count[s[i] - 'a']);
    if (mx == i) {
      res.push_back(mx - prev);
      prev = mx;
    }
  }
  return res;
}