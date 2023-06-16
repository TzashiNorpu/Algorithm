//
// Created by tseringnorpu on 6/15/2023.
//
#include "../header/header.h"

using namespace zero;

int Solution::maxDiff(int num) {
  // 只替换一次
  string maxS = to_string(num);;
  string minS = maxS;
  int n = minS.size();

  char c1 = maxS[0];
  // 找到高位里第一个不为'9'的字符
  if (c1 == '9') {
    for (int i = 0; i < n; ++i) {
      if (maxS[i] != c1) {
        c1 = maxS[i];
        break;
      }
    }
  }
  char c2 = minS[0];
  bool isFirstMin = true;
  // 高位里找到第一个不为'1' 和'0'的字符
  if (c2 == '1') {
    for (int i = 0; i < n; ++i) {
      if (minS[i] != c2 && minS[i] != '0') {
        c2 = minS[i];
        isFirstMin = false;
        break;
      }
    }
  }
  for (int i = 0; i < n; ++i) {
    if (maxS[i] == c1)
      maxS[i] = '9';
    if (minS[i] == c2) {
      if (isFirstMin) minS[i] = '1';
      else minS[i] = '0';
    }
  }
  return stoi(maxS) - stoi(minS);
}