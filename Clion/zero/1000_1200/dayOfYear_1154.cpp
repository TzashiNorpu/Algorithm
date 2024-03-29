//
// Created by TzashiNorpu on 2023/6/2.
//
#include "../header/header.h"

using namespace zero;

int Solution::dayOfYear(string date) {
  int days[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  int y = stoi(date.substr(0, 4)), m = stoi(date.substr(5, 2)), d = stoi(date.substr(8));
  if (m > 2 && y % 4 == 0 && (y % 100 != 0 || y % 400 == 0))++d;
  while (--m > 0) d += days[m - 1];
  return d;
}