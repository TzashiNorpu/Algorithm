//
// Created by TzashiNorpu on 7/13/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

double largestTriangleArea_812::largestTriangleArea(vector<vector<int>> &points) {
  double res = 0;
  for (auto &i: points)
    for (auto &j: points)
      for (auto &k: points)
        res = max(res,
                  0.5 * abs(i[0] * j[1] + j[0] * k[1] + k[0] * i[1] - j[0] * i[1] - k[0] * j[1] - i[0] * k[1]));
  return res;
}