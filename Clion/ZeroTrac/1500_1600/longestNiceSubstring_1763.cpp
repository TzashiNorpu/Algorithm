//
// Created by TzashiNorpu on 7/8/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

string LongestNiceSubstring::longestNiceSubstring(string s) {
  if (s.size() < 2) return "";
  set<char> set;
  for (char c: s) {
    set.insert(c);
  }
  for (int i = 0; i < s.size(); i++) {
    if (set.count(tolower(s[i])) == 1 && set.count(toupper(s[i])) == 1) continue;
    string left = longestNiceSubstring(s.substr(0, i));
    string right = longestNiceSubstring(s.substr(i + 1));
    return left.size() >= right.size() ? left : right;
  }
  return s;
}
