//
// Created by TzashiNorpu on 7/8/2022.
//

#include "../header/1500_1600.h"

using namespace ZeroTrac;

int EliminateMaximum::eliminateMaximum(vector<int> &dist, vector<int> &speed) {
  for (int i = 0; i < dist.size(); i++) {
    // 向下取整  如位置为4、5 速度都为 5，则都是一步就可以到了
    dist[i] = (dist[i] - 1) / speed[i];
  }
  sort(dist.begin(), dist.end());
  for (int i = 0; i < dist.size(); i++) {
    if (i > dist[i]) return i;
  }
  return dist.size();
}
