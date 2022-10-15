//
// Created by TzashiNorpu on 8/11/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

vector<int> Solution::prevPermOpt1(vector<int> &arr) {
  // 找到从后往前第一个递增的位置，将其和离自己最远的大于自己的数字交换【大于自己的数字连续时找到其中离自己最近的】
  int n = arr.size();
  if (n < 2) return arr;
  int idx = -1;
  // find the largest i such that A[i] > A[i + 1]
  for (int i = n - 1; i >= 1; --i) {
    if (arr[i] < arr[i - 1]) {
      idx = i - 1;
      break;
    }
  }
  // the array already sorted, not smaller permutation
  if (idx == -1) return arr;
  // find the largest j such that A[j] > A[i], then swap them
  for (int i = n - 1; i > idx; --i) {
    // the second check to skip duplicate numbers
    // [3,2,2,3] -> [2,3,2,3]
    // [3,1,2,3] -> [2,1,3,3]
    if (arr[i] < arr[idx] && arr[i] != arr[i - 1]) {
      int tmp = arr[i];
      arr[i] = arr[idx];
      arr[idx] = tmp;
      break;
    }
  }
  return arr;
}