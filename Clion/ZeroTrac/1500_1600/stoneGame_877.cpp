//
// Created by TzashiNorpu on 7/22/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

bool stoneGame_877::stoneGame(vector<int> &piles) {
  // 3,2,10,4
  int n = piles.size();
  vector<vector<int>> dp(n, vector<int>(n, 0));
  for (int i = 0; i < n; ++i) dp[i][i] = piles[i];
  for (int i = n - 2; i >= 0; --i) {
    for (int j = i + 1; j < n; ++j)
      dp[i][j] = max(piles[i] - dp[i + 1][j], piles[j] - dp[j][j - 1]);
  }
  return dp[0][n - 1] > 0;
}