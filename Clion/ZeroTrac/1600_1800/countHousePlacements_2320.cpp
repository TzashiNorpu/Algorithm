//
// Created by TzashiNorpu on 7/27/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;
const int MOD = 1e9 + 7, MX = 1e4 + 1;
int f[MX] = {1, 2};
int init = []() {
    for (int i = 2; i < MX; ++i)
      f[i] = (f[i - 1] + f[i - 2]) % MOD;
    return 0;
}();

/*f[i] 表示前 i 个地块的放置方案数，其中第 i 个地块可以放房子，也可以不放房子。
考虑第 i 个地块：
若不放房子，那么第 i-1 个地块可放可不放，则有 f[i] = f[i-1]
若放房子，那么第 i-1 个地块无法放房子，第 i-2 个地块可放可不放，则有 f[i] = f[i-2]
因此
        f[i] = f[i-1] + f[i-2]
边界为
        f[0]=1，空也是一种方案；
        f[1]=2，放与不放两种方案。*/

int Solution::countHousePlacements_2320(int n) {
  return (long) f[n] * f[n] % MOD;
}