//
// Created by TzashiNorpu on 10/13/2022.
//
#include "1800_1900.h"

using namespace ZeroTrac;

/*
 * It's a bottom-up DP implementation. The boolean value represents whether this position is reachable from start.
 *  So the first step is to generate the table. Here the table was pre-labeled True or False, thus '1's are already labeled False.
 * To determine the state of dp[i], one need to check the states in window dp[i-maxJ : i-minJ],
 *  because any one of them can reach i if it's labeled True.
 * Then you need to check if there is a True in this window. Notice that this is a sliding window problem,
 *  so you don't need to calculate it everytime. You only need to remove the effect from dp[i-maxJ-1] and add the dp[i-minJ].
 *    This is done by these two lines of code pre += dp[i - minJ] and pre -= dp[i - maxJ - 1]
 * The if statements if i >= minJ: and if i > maxJ: are dealing with the initial boundary.
 */
bool Solution::canReach(string s, int minJump, int maxJump) {
  int n = s.size(), pre = 0;
  vector<bool> dp(n, false);
  dp[0] = true;
  for (int i = 1; i < n; ++i) {
    if (i >= minJump)
      pre += dp[i - minJump];
    if (i > maxJump)
      pre -= dp[i - maxJump - 1];
    dp[i] = (pre > 0) && s[i] == '0';
  }
  return dp[n - 1];
}