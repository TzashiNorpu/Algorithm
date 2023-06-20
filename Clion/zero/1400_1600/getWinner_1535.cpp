//
// Created by TzashiNorpu on 2023/6/20.
//
#include "../header/header.h"

using namespace zero;

int Solution::getWinner(vector<int> &arr, int k) {
  int curr = arr[0], win = 0;
  for (int i = 1; i < arr.size(); ++i) {
    if (arr[i] > curr) {
      curr = arr[i];
      win = 0;
    }
    if (++win == k) break;
  }
  return curr;
}