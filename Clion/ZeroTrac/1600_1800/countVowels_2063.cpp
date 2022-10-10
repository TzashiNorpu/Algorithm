//
// Created by TzashiNorpu on 10/10/2022.
//
#include "header.h"

using namespace ZeroTrac;

long long Solution::countVowels(string word) {
  /*
   * For each vowels s[i],
   * it could be in the substring starting at s[x] and ending at s[y],
   * where 0 <= x <= i and i <= y < n,
   * that is (i + 1) choices for x and (n - i) choices for y.
   * So there are (i + 1) * (n - i) substrings containing s[i].
   */
  long res = 0, n = word.size();
  for (int i = 0; i < n; ++i)
    if (string("aeiou").find(word[i]) != string::npos)
      res += (i + 1) * (n - i);
  return res;
}