//
// Created by TzashiNorpu on 2023/6/2.
//
#include "../../header/header.h"

using namespace labuladong;

void Solution::reverseString(vector<char> &s) {
  int l = 0, r = s.size() - 1;
  while (l < r) {
    auto c = s[l];
    s[l] = s[r];
    s[r] = c;
    l++, r--;
  }
}