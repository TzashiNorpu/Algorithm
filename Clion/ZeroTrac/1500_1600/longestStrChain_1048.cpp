//
// Created by TzashiNorpu on 7/25/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

static bool compare(const string &s1, const string &s2) {
  return s1.length() < s2.length();
}

int longestStrChain_1048::longestStrChain(vector<string> &words) {
  sort(words.begin(), words.end(), compare);
  unordered_map<string, int> dp;
  int res = 0;
  for (string w: words) {
    for (int i = 0; i < w.length(); i++) {
      string pre = w.substr(0, i) + w.substr(i + 1);
      dp[w] = max(dp[w], dp.find(pre) == dp.end() ? 1 : dp[pre] + 1);
    }
    res = max(res, dp[w]);
  }
  return res;
}