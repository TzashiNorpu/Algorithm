//
// Created by TzashiNorpu on 7/11/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

int countPalindromicSubsequence_1930::countPalindromicSubsequence(string s) {
  int res = 0;
  for (char c = 'a'; c <= 'z'; c++) {
    int left_index = s.find_first_of(c);
    int right_index = s.find_last_of(c);
    res += countAlphabet(left_index, right_index, s);
  }
  return res;
}

int countPalindromicSubsequence_1930::countAlphabet(int start_index, int end_index, string s) {
  unordered_set<char> set;
  for (int i = start_index + 1; i < end_index; i++)
    set.insert(s[i]);
  return set.size();
}
