//
// Created by TzashiNorpu on 10/14/2022.
//

#include "1800_1900.h"

using namespace ZeroTrac;

/*
 * A类：可以分享秘密的人数
 * B类：第n天知道密码但是不能分享的人数
 * C类：遗忘秘密的人数
 * f[i]  第 i 天 A 类人数,这些人可以在第 [i+delay,i+forget) 天告诉新的人。因此，我们可以用 f[i] 去更新后续的 f[j]
 */
int Solution::peopleAwareOfSecret(int n, int delay, int forget) {
  int mod = pow(10, 9) + 7;
  int f[n], cnt_b = 0;
  memset(f, 0, sizeof(f));
  f[0] = 1;
  for (int i = 0; i < n; ++i) {
    if (i + delay >= n) cnt_b = (cnt_b + f[i]) % mod;
    for (int j = i + delay; j < min(i + forget, n); ++j)
      f[j] = (f[j] + f[i]) % mod;
  }
  return (f[n - 1] + cnt_b) % mod;
}