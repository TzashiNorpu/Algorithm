//
// Created by TzashiNorpu on 2023/6/2.
//
#include "../header/header.h"

using namespace zero;

int Solution::countOperations(int num1, int num2) {
  /*
   * 90 8 -> 10 -> 12 8
   */
  int res = 0;
  while (min(num1, num2) > 0) {
    if (num1 > num2)
      swap(num1, num2);
    res += num2 / num1;
    num2 %= num1;
  }
  return res;
}