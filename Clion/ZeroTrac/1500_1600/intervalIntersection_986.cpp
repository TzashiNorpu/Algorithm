//
// Created by TzashiNorpu on 7/13/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

vector<vector<int>>
intervalIntersection_986::intervalIntersection(vector<vector<int>> &firstList, vector<vector<int>> &secondList) {
  // 长度不一样
  vector<vector<int>> v;
  int i = 0, j = 0;
  while (i < firstList.size() && j < secondList.size()) {
    int l = max(firstList[i][0], secondList[j][0]);
    int u = min(firstList[i][1], secondList[j][1]);
    if (l <= u) v.push_back({l, u});
    if (firstList[i][1] < secondList[j][1]) i++;
    else j++;
  }
  return v;
}