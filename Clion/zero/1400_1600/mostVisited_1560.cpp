//
// Created by TzashiNorpu on 2023/6/27.
//
#include "../header/header.h"

using namespace zero;

vector<int> Solution::mostVisited(int n, vector<int> &rounds) {
  int len = rounds.size();
  int start = rounds[0], end = rounds[len - 1];
  vector<int> res;
  if (start <= end) {
    for (int i = start; i <= end; ++i) {
      res.push_back(i);
    }
    return res;
  } else {
    // s->n 1->end
    for (int i = 1; i <= end; ++i) {
      res.push_back(i);
    }
    for (int i = start; i <= n; ++i) {
      res.push_back(i);
    }
    return res;
  }
}