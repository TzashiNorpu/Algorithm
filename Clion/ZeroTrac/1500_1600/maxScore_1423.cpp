//
// Created by TzashiNorpu on 7/21/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

int maxScore_1423::maxScore(vector<int> &cardPoints, int k) {
  int res = 0;
  vector<int> arr;
  arr.insert(arr.begin(), cardPoints.end() - k, cardPoints.end());
  arr.insert(arr.end(), cardPoints.begin(), cardPoints.begin() + k);
  int sum = 0;
  for (int l = 0, r = 0; r < 2 * k; ++r) {
    sum += arr[r];
    if (r - l == k - 1) {
      res = max(res, sum);
      sum -= arr[l++];
    }
  }
  return res;
}

