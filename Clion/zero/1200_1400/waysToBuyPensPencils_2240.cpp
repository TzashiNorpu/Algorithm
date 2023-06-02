//
// Created by TzashiNorpu on 2023/6/2.
//
#include "../header/header.h"

using namespace zero;

long long Solution::waysToBuyPensPencils(int total, int cost1, int cost2) {
//  long long res = 0;
//  long long m = total / cost1;
//  long long n = total / cost2;
//  if (m < n) {
//    for (int i = 0; i <= m; ++i) {
//      res += (total - i * cost1) / cost2 + 1;
//      //printf("res=%d\n",res);
//    }
//  } else {
//    for (int i = 0; i <= n; ++i) {
//      res += (total - i * cost2) / cost1 + 1;
//    }
//  }
//  return res;
  if (cost1 < cost2) return waysToBuyPensPencils(total, cost2, cost1);
  long long res = 0;
  // cost1 大
  long long m = total / cost1;
  for (int i = 0; i <= m; ++i) {
    res += (total - i * cost1) / cost2 + 1;
    //printf("res=%d\n",res);
  }
  return res;
}