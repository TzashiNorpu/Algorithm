//
// Created by TzashiNorpu on 10/10/2022.
//
#include "header.h"

using namespace ZeroTrac;

vector<int> Solution::bestCoordinate(vector<vector<int>> &towers, int radius) {
  int sum;
  int ans = 0;
  pair<int, int> ansCoor;
  for (int x = 0; x <= 50; ++x) {
    for (int y = 0; y <= 50; ++y) {
      sum = 0;
      for (auto it: towers) {
        int xa = it[0];
        int ya = it[1];
        int qa = it[2];
        int dis = pow(x - xa, 2) + pow(y - ya, 2);
        if (dis > radius * radius) continue;
        sum += (int) (qa / (1 + sqrt(dis)));
      }
      if (sum > ans)ans = sum, ansCoor = {x, y};
    }
  }
  return vector<int>{ansCoor.first, ansCoor.second};
}