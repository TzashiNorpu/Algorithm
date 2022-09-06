//
// Created by TzashiNorpu on 8/12/2022.
//
#include "header.h"

using namespace ZeroTrac;

int Solution::maxConsecutiveAnswers(string answerKey, int k) {
  int size = answerKey.size(), left = 0, res = 0, cnt = 0;
  //  maximum substring of 'T' which contains k 'F'
  for (int i = 0; i < size; i++) {
    if (answerKey[i] == 'F')
      cnt++;
    while (cnt > k) {
      if (answerKey[left] == 'F')
        cnt--;
      left++;
    }
    res = max(i - left + 1, res);
  }
  cnt = 0, left = 0;
  for (int i = 0; i < size; ++i) {
    if (answerKey[i] == 'T')
      cnt++;
    while (cnt > k) {
      if (answerKey[left] == 'T')
        cnt--;
      left++;
    }
    res = max(res, i - left + 1);
  }
  return res;
}