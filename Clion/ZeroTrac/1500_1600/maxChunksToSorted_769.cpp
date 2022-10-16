//
// Created by TzashiNorpu on 7/20/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

/*For example,

        original: 0, 2, 1, 4, 3, 5, 7, 6
max:      0, 2, 2, 4, 4, 5, 7, 7
sorted:   0, 1, 2, 3, 4, 5, 6, 7
index:    0, 1, 2, 3, 4, 5, 6, 7
The chunks are: 0 | 2, 1 | 4, 3 | 5 | 7, 6*/

int maxChunksToSorted_769::maxChunksToSorted(vector<int> &arr) {
  /*int n = arr.size();
  int res = 0;
  int dp[n];
  dp[0] = arr[0];
  for (int i = 1; i < n; i++) dp[i] = max(dp[i - 1], arr[i]);
  for (int i = 0; i < n; ++i)
      if (dp[i] == i) res++;
  return res;*/

  int n = arr.size();
  int res = 0;
  int m = 0;
  for (int i = 0; i < n; i++) {
    m = max(m, arr[i]);
    if (m == i) res++;
  }
  return res;
}
