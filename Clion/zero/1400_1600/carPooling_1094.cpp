//
// Created by TzashiNorpu on 2023/6/21.
//
#include "../header/header.h"

using namespace zero;

bool Solution::carPooling(vector <vector<int>> &trips, int capacity) {
  map<int, int> count;
  for (auto &trip: trips)
    count[trip[1]] += trip[0], count[trip[2]] -= trip[0];
  for (auto &m: count) {
    if ((capacity -= m.second) < 0)return false;
  }
  return true;
}