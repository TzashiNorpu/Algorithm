//
// Created by TzashiNorpu on 2023/6/5.
//
#include "../header/header.h"

using namespace zero;

double Solution::average(vector<int> &salary) {
  std::sort(salary.begin(), salary.end());
  int len = salary.size();
  int mi = salary[0], mx = salary[len - 1];
  int sum = 0, count = 0;
  for (auto sa: salary) {
    if (sa != mi && sa != mx) sum += sa, count++;
  }
  return sum * 1.0 / count;
}