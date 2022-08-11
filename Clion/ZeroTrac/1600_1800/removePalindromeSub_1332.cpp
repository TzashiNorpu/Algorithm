//
// Created by TzashiNorpu on 8/10/2022.
//
#include "header.h"

using namespace ZeroTrac;

bool validPalindrome(string s) {
  int i = 0, j = s.length() - 1;
  while (i < j) {
    if (s[i] == s[j])i++, j--;
    else break;
  }
  return i >= j;
}

int Solution::removePalindromeSub(string s) {
  if (validPalindrome(s)) return 1;
  return 2;
}