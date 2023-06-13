//
// Created by TzashiNorpu on 2023/6/13.
//
#include "../header/header.h"

using namespace zero;

int Solution::balancedString(string s) {
  // 删除窗口内的元素使得条件满足
  // 窗口右移是减少元素个数
  // 窗口右移时增加元素个数
  int i = 0, j = 0, n = s.size();
  int res = n, k = n / 4;
  unordered_map<char, int> m;
  for (auto c: s) {
    m[c]++;
  }
  for (; j < n; ++j) {
    // 拿掉窗口里的字符
    m[s[j]]--;
    // 不断调小满足的窗口
    // 不满足时窗口右移
    while (i < n && m['Q'] <= k && m['W'] <= k && m['E'] <= k && m['R'] <= k) {
      printf("i=%d,j=%d\n", i, j);
      printf("Q=%d,W=%d,E=%d,R=%d\n", m['Q'], m['W'], m['E'], m['R']);
      res = min(res, j - i + 1);
      // i>j时会放入字符
      m[s[i++]]++;
      printf("Q=%d,W=%d,E=%d,R=%d\n", m['Q'], m['W'], m['E'], m['R']);
    }
  }
  return res;
}