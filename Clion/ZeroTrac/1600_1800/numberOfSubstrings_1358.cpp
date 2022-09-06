//
// Created by TzashiNorpu on 8/15/2022.
//
#include "header.h"

using namespace ZeroTrac;

int Solution::numberOfSubstrings(string s) {
  int count[3] = {0, 0, 0}, res = 0, i = 0, n = s.length();
  for (int j = 0; j < n; ++j) {
    ++count[s[j] - 'a'];
    while (count[0] && count[1] && count[2])
      --count[s[i++] - 'a'];
    res += i;
  }
  return res;
}