//
// Created by TzashiNorpu on 7/14/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

int longestPalindrome_2131::longestPalindrome(vector<string> &words) {
  unordered_map<string, int> map;
  int res = 0;
  int unpaired = 0;
  for (string s: words) {
    if (s[0] == s[1]) {
      if (map[s] > 0) {
        unpaired--;
        res += 4;
        map[s]--;
      } else {
        map[s]++;
        unpaired++;
      }
    } else {
      string t = s;
      std::reverse(t.begin(), t.end());
      if (map[t] > 0) {
        res += 4;
        map[t]--;
      } else map[s]++;
    }
  }
  return res + (unpaired > 0 ? 2 : 0);
}
