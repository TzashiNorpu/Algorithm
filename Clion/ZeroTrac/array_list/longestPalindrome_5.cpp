//
// Created by TzashiNorpu on 10/18/2022.
//
#include "array_list.h"

using namespace Array_List;

string Solution::longestPalindrome(string s) {
  string res = "";
  auto palindrome = [&](string s, int l, int r) {
      while (l >= 0 && r < s.size() && s[l] == s[r]) l--, r++;
      return s.substr(l + 1, r - l - 1);
  };
  for (int i = 0; i < s.size(); ++i) {
    string s1 = palindrome(s, i, i);
    string s2 = palindrome(s, i, i + 1);
    res = res.size() > s1.size() ? res : s1;
    res = res.size() > s2.size() ? res : s2;
  }
  return res;
}