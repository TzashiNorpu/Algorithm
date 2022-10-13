//
// Created by TzashiNorpu on 10/13/2022.
//
#include "1800_1900.h"

using namespace ZeroTrac;

/*
 * gcd(long a, long b)求最大公约数 辗转相除法，
 * lcm(long a, long b)求最小公倍数，
 * 从简单情况说起，设有一个数字i，从1到i过程中能整除a的数字有i/a个
 * 那么同样的能整除b的数字有i/b个
 * 能同时整除a和b的数字有i/lcm(a, b)个，lcm(a, b)为(a,b)的最小公倍数，
 * 那么我们就可以知道，数字n以下，符合题意的数字有
 * n/a + n/b - n/lcm(a,b)个，需要减去多计数一遍的最小公倍数个数
 */
int Solution::nthMagicalNumber(int n, int a, int b) {
  function<long(long, long)> gcd = [&](long a, long b) -> long {
      return b == 0 ? a : gcd(b, a % b);
  };
  function<long(long, long)> lcm = [&](long a, long b) -> long {
      return (a * b) / gcd(a, b);
  };

  auto f = [&](long a, long b, long x) -> long {
      return x / a + x / b - x / (lcm(a, b));
  };

  long mod = (long) (1e9 + 7);
  long l = 2, r = (long) n * min(a, b);
  while (l <= r) {
    long mid = l + ((r - l) >> 1);
    if (f(a, b, mid) < n) l = mid + 1;
    else r = mid - 1;
  }
  return l % mod;
}