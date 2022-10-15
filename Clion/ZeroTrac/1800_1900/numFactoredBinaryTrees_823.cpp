//
// Created by TzashiNorpu on 10/13/2022.
//
#include "../header/1800_1900.h"

using namespace ZeroTrac;

/*
 * 最大值 v 一定会被用在树的根节点上，设 dp(v) 是以 v 为根节点的树种类数。
 * 如果树根节点有孩子 x 和 y 满足 x * y == v，那么就有 dp(x) * dp(y) 种方法构造这棵树。
 * 总共会有 dp(x)∗dp(y) 种方法构造以 v 为根的树。
 */

int Solution::numFactoredBinaryTrees(vector<int> &arr) {
  long res = 0, mod = pow(10, 9) + 7;
  unordered_map<int, long> dp;
  // 先算小的值的方案数
  std::sort(arr.begin(), arr.end());
  int n = arr.size();
  for (int i = 0; i < n; ++i) {
    dp[arr[i]] = 1;
    for (int j = 0; j < i; ++j)
      if (arr[i] % arr[j] == 0)
        dp[arr[i]] = (dp[arr[i]] + dp[arr[j]] * dp[arr[i] / arr[j]]) % mod;
    res = (res + dp[arr[i]]) % mod;
  }
  return res;
}