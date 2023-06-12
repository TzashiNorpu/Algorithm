//
// Created by TzashiNorpu on 2023/6/12.
//
#include "../header/header.h"

using namespace zero;

int Solution::maximumCostSubstring(string s, string chars, vector<int> &vals) {
  unordered_map<char, int> m;
  for (int i = 0; i < chars.length(); ++i) {
    m[chars[i]] = vals[i];
  }
  int n = s.length();
  vector<int> dp(n, 0);
  dp[0] = max(m.count(s[0]) ? m[s[0]] : s[0] - 'a' + 1, 0);
  int res = dp[0];
  for (int i = 1; i < n; ++i) {
    int curr = m.count(s[i]) ? m[s[i]] : s[i] - 'a' + 1;
    dp[i] = max(curr, dp[i - 1] + curr);
    res = max(res, dp[i]);
  }
  return res;
}