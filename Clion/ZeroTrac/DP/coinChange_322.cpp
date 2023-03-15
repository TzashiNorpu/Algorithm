//
// Created by TzashiNorpu on 3/13/2023.
//
#include "dp.h"

using namespace ZeroTrac;

int Solution::coinChange(vector<int> &coins, int amount) {
  vector<int> dp(amount + 1, amount + 1);
  dp[0] = 0;
  for (int i = 1; i <= amount; ++i) {
    for (int coin: coins) {
      if (i - coin < 0) continue;
      dp[i] = min(dp[i], 1 + dp[i - coin]);
    }
  }
  return (dp[amount] == amount + 1) ? -1 : dp[amount];
}