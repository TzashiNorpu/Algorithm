//
// Created by TzashiNorpu on 2023/6/8.
//
#include "../header/header.h"

using namespace zero;

int Solution::distinctPrimeFactors(vector<int> &nums) {
  unordered_set<int> st;
  for (auto x: nums) {
    for (int i = 2; i * i <= x; i++) {
      if (x % i == 0) { /* 保证i一定为质数 */
        st.insert(i);
        while (x % i == 0) {  /* 除掉质因数 */
          x /= i;
        }
      }
    }
    if (x > 1) {
      st.insert(x);
    }
  }
  return st.size();
}