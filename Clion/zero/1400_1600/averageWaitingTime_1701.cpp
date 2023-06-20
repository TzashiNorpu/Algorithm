//
// Created by TzashiNorpu on 2023/6/20.
//
#include "../header/header.h"

using namespace zero;

double Solution::averageWaitingTime(vector <vector<int>> &customers) {
  double wait = 0, cur = 0;
  for (auto &a: customers) {
    cur = max(cur, 1.0 * a[0]) + a[1];
    wait += cur - a[0];
  }
  return 1.0 * wait / customers.size();
}