//
// Created by TzashiNorpu on 2023/6/20.
//
#include "../header/header.h"

using namespace zero;

int Solution::kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
  if (numOnes >= k) return k;
  if (numOnes + numZeros >= k) return numOnes;
  return numOnes - (k - numOnes - numZeros);
}