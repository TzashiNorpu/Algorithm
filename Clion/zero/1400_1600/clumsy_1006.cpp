//
// Created by TzashiNorpu on 2023/6/7.
//
#include "../header/header.h"

using namespace zero;

int Solution::clumsy(int n) {
  // 分组
  // 15 * 14 / 13 + [12 - 11 * 10 / 9] + [8 - 7 * 6 / 5] + [4 - 3 * 2 / 1]
  if (n == 1) return 1;
  if (n == 2) return 2;
  if (n == 3) return 6;
  if (n == 4) return 7;
  function<int(int)> helper = [&](int N) -> int {
      if (N == 0) return 0;
      if (N == 1) return 1;
      if (N == 2) return 1;
      if (N == 3) return 1;
      return N - (N - 1) * (N - 2) / (N - 3) + helper(N - 4);
  };
  return n * (n - 1) / (n - 2) + helper(n - 3);
}