//
// Created by TzashiNorpu on 2023/6/20.
//
#include "../header/header.h"

using namespace zero;

long long Solution::interchangeableRectangles(vector <vector<int>> &rectangles) {
  int n = rectangles.size();
  unordered_map<double, long long> map;
  vector<long long> dp;
  long long res = 0;
  for (int i = n - 1; i >= 0; --i) {
    double ratio = (double) rectangles[i][0] * 1.0 / rectangles[i][1];
    map[ratio]++;
    res += (map[ratio] - 1);
  }
  return res;
}