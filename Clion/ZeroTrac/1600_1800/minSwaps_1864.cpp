//
// Created by TzashiNorpu on 7/25/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

int Solution::minSwaps_1864(string s) {
  int cnt0 = count(begin(s), end(s), '0'), cnt1 = s.size() - cnt0, miss0 = 0, miss1 = 0;
  if (abs(cnt0 - cnt1) > 1)
    return -1;
  for (int i = 0; i < s.size(); i += 2) {
    miss0 += s[i] != '0';
    miss1 += s[i] != '1';
  }
  return cnt0 == cnt1 ? min(miss0, miss1) : cnt0 > cnt1 ? miss0 : miss1;
}