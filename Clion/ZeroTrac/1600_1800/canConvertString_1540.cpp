//
// Created by TzashiNorpu on 8/10/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

bool Solution::canConvertString(string s, string t, int k) {
  if (s.size() != t.size()) return false;
  unordered_set<int> set;
  vector<int> multi(25, 0);
  for (int i = 0; i < s.length(); ++i) {
    if (s[i] != t[i]) {
      int step = (t[i] - s[i]);
      if (step < 0) step += 26;
      if (step > k) return false;
      if (set.count(step) == 0) set.insert(step);
      else {
        int v = step + 26 * multi[step - 1];
        if (v > k) return false;
        if (set.count(v) != 0) return false;
        else set.insert(v), multi[step - 1]++;
      }
    }
  }
  return true;
}

bool canConvertString_1(string s, string t, int k) {
  if (s.size() != t.size())
    return false;
  int mul[26] = {};
  for (int i = 0; i < s.size(); ++i) {
    int shift = t[i] - s[i] + (t[i] < s[i] ? 26 : 0);
    if (shift != 0 && shift + mul[shift] * 26 > k)
      return false;
    ++mul[shift];
  }
  return true;
}