//
// Created by TzashiNorpu on 2023/6/2.
//
#include "../../header/header.h"

using namespace labuladong;

string Solution::longestPalindrome(string s) {
  string res = "";
  auto pa = [&](int l, int r) -> string {
      while (l >= 0 && r < s.size() && s[l] == s[r]) l--, r++;
      return s.substr(l + 1, r - l - 1);
  };
  for (int i = 0; i < s.size(); ++i) {
    string s1 = pa(i, i);
    string s2 = pa(i, i + 1);
    res = s1.size() > res.size() ? s1 : res;
    res = s2.size() > res.size() ? s2 : res;
  }
  return res;
}