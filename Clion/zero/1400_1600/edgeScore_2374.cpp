//
// Created by TzashiNorpu on 2023/6/12.
//
#include "../header/header.h"

using namespace zero;

int Solution::edgeScore(vector<int> &edges) {
  int index = -1;
  long mx = -1;
  int n = edges.size();
  vector<long> v(n, 0);
  for (int i = 0; i < n; ++i) {
    v[edges[i]] += i;
    //printf("edge[i]=%d,sum=%d,mx=%d\n", edges[i], v[edges[i]],mx);
    if (v[edges[i]] >= mx) {
      if (v[edges[i]] > mx)
        index = edges[i];
      else {
        if (edges[i] < index) {
          index = edges[i];
        }
      }
    }
    mx = max(mx, v[edges[i]]);
  }
  return index;
}