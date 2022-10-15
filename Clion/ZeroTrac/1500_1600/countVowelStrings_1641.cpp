//
// Created by TzashiNorpu on 7/7/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

int CountVowelStrings::countVowelStrings(int n) {
  /*
   * dp[n][k] means the number of strings constructed by at most k different characters.
   * n：单词的长度  n = 3 -> "aaa"  "aeo"
      If k = 1, use only u
      If k = 2, use only o,u
      If k = 3, use only i,o,u
      If k = 4, use only e,i,o,u
      If k = 5, use only a,e,i,o,u
      Take dp[3][5] = dp[3][4] + dp[2][5] as example:

   To get all combinations with a e i o u for length 3, all you need to do is plus conbinations of
   a e i o u for length 2 (Just put a before all previous combination,
   such as a(aa)) and e i o u for length 3 (Just replace first character in all combinations with a, such as eee -> aee).
   */
  vector<vector<int>> dp(n + 1, vector<int>(6));
  for (int i = 1; i <= n; i++) {
    for (int k = 1; k <= 5; k++) {
      dp[i][k] = dp[i][k - 1] + (i > 1 ? dp[i - 1][k] : 1);
    }
  }
  return dp[n][5];
}