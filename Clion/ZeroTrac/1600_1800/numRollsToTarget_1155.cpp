//
// Created by TzashiNorpu on 9/6/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

int Solution::numRollsToTarget(int d, int f, int target) {
  vector<int> dp(target + 1);
  dp[0] = 1;
  int i, j, k;
  for (i = 1; i <= d; ++i)
    for (k = target; k >= (i == d ? target : 0); --k)
      for (j = k - 1, dp[k] = 0; j >= max(0, k - f); --j)
        dp[k] = (dp[k] + dp[j]) % 1000000007;
  return dp[target];
}