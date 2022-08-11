//
// Created by TzashiNorpu on 8/10/2022.
//
#include "header.h"

using namespace ZeroTrac;

int Solution::concatenatedBinary(int n) {
  // f(4) = 11011100 = (1 << (2+2+3)) + (2 << (2+3)) + (3 << 3) + (4 << 0)
  //  f(0) = 0
  //  f(1) = 1     = (f(0) << 1) + 1  // len(1) = 1
  //  f(2) = 110   = (f(1) << 2) + 2  // len(2) = 2
  //  f(3) = 11011 = (f(2) << 2) + 3  // len(3) = 2
  //  ...
  int MOD = 1e9 + 7;
  long ans = 0, len = 0;
  for (int i = 1; i <= n; ++i) {
    // len only increment when the i is a power of 2
    if ((i & (i - 1)) == 0) len++;
    ans = ((ans << len) + i) % MOD;
  }
  return ans;
}