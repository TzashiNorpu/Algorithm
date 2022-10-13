//
// Created by TzashiNorpu on 9/6/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

long long Solution::numberOfWays(string s) {
  // a and b are the number of occurances of '1' and '0' after the current building respectively.
  long long a = 0, b = 0, ans = 0;
  for (int i = 0; i < s.length(); i++) {
    if (s[i] == '1') a++;
    else b++;
  }
  // c and d are the number of occurances of '1' and '0' before the current building respectively.
  long long c = 0, d = 0;
  for (int i = 0; i < s.length(); i++) {
    // Counting the sequences of "010"
    if (s[i] == '1')
      ans += (d * b), a--, c++;
    else
      // Counting the sequences of "101"
      ans += (a * c), b--, d++;
  }
  return ans;
}