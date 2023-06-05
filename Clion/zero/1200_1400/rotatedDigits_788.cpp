//
// Created by TzashiNorpu on 2023/6/5.
//
#include "../header/header.h"

using namespace zero;

int Solution::rotatedDigits(int n) {
  // 没有3、4、7
  // 至少出现一次2、5、6、9
  // 0、1、8没有要求
  int check[10] = {0, 0, 1, -1, -1, 1, 1, -1, 0, 1};
  int res = 0;
  for (int i = 0; i <= n; ++i) {
    string s = to_string(i);
    bool valid = true, diff = false;
    for (auto c: s) {
      if (check[c - '0'] == -1) {
        valid = false;
        break;
      }
      if (check[c - '0'] == 1) diff = true;
    }
    if (valid && diff) res++;
  }
  return res;
}