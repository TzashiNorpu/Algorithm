//
// Created by TzashiNorpu on 2023/6/6.
//
#include "../header/header.h"

using namespace zero;

bool Solution::checkZeroOnes(string s) {
  int max_one = 0, max_zero = 0;
  int one = 0, zero = 0;
  for (int i = 0; i < s.size(); ++i) {
    if (s[i] == '0') zero++, one = 0, max_zero = max(max_zero, zero);
    else one++, zero = 0, max_one = max(max_one, one);
  }
  //printf("one=%d,zero=%d\n",max_one,max_zero);
  return max_one > max_zero;
}