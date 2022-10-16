#include "../header/1600_1800.h"

using namespace ZeroTrac;

int Solution::countGoodNumbers(long long n) {
  int MOD = 1e9 + 7;
  function<long long(long long, long long)> power = [&](long long b, long long p) -> long long {
      if (p == 0)
        return 1;
      long long v = power(b, p / 2) % MOD;
      return (v * v * (p % 2 == 1 ? b : 1)) % MOD;
  };
  long long odd = n / 2;
  long long even = n / 2 + n % 2;

  return (power(5, even) * power(4, odd)) % MOD;
}