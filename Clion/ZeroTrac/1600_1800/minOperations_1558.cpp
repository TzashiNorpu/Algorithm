//
// Created by TzashiNorpu on 8/11/2022.
//
#include "header.h"

using namespace ZeroTrac;

int Solution::minOperations(vector<int> &n) {
  /*
   * So the the concept is this:
    Count number of odd numbers in the process of making each number zero by dividing it by 2.
    eg - [10] 10 -> 5 -> 2->1->0 two odd numbers(5 and 1)
    Count number of division needed to make largest number zero. This is one time task since divisions are shared by all the numbers.
    eg - 10->5->2->1->0 4 operations
    so the result is 4+2-1 since making 1 to zero is common in both the steps.
   */
  int res = 0, maxLen = 1;
  for (int a: n) {
    int bits = 0;
    while (a > 0) {
      res += a & 1;
      bits++;
      a >>= 1;
    }
    maxLen = max(maxLen, bits);
  }
  return res + maxLen - 1;
}