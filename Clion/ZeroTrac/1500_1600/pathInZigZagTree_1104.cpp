//
// Created by TzashiNorpu on 7/14/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;


vector<int> pathInZigZagTree_1104::pathInZigZagTree(int label) {
  /*
  vector<int> res;
  int node_count = 1, level = 1;
  while (label >= node_count * 2) {
      node_count *= 2;
      level++;
  }
  while (label) {
      res.push_back(label);
      int level_max = pow(2, level) - 1;
      int level_min = pow(2, level - 1);
      label = (level_max + level_min - label) / 2;
      level--;
  }
  return vector<int>(rbegin(res), rend(res));*/
  vector<int> res;
  int pa = label;
  res.insert(res.cbegin(), pa);
  while (pa != 1) {
    int offset = pow(2, (int) log2(pa) + 1) - 1 - pa;
    pa = (pow(2, (int) log2(pa)) + offset) / 2;
    res.insert(res.cbegin(), pa);
  }
  return res;
}
