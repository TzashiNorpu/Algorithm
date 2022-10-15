//
// Created by TzashiNorpu on 8/10/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

int Solution::minimumLengthEncoding(vector<string> &words) {
  unordered_set<string> s(words.begin(), words.end());
  for (string w: s)
    for (int i = 1; i < w.size(); ++i) {
      string x = w.substr(i);
      s.erase(x);
    }
  int res = 0;
  for (string w: s) res += w.size() + 1;
  return res;
}