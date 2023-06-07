//
// Created by TzashiNorpu on 2023/6/7.
//
#include "../header/header.h"

using namespace zero;

string Solution::oddString(vector <string> &words) {
  int n = words[0].size();
  vector<int> d1(n - 1);
  for (int i = 1; i < n; ++i) {
    d1[i - 1] = words[0][i] - words[0][i - 1];
  }
  vector<int> d2(n - 1);
  for (int i = 1; i < n; ++i) {
    d2[i - 1] = words[1][i] - words[1][i - 1];
  }

  auto vector_equal = [&](vector<int> v1, vector<int> v2) -> bool {
      for (int i = 0; i < n - 1; ++i) {
        if (v1[i] != v2[i]) return false;
      }
      return true;
  };
  bool flag = vector_equal(d1, d2);
  //printf("flag=%d\n",flag);
  for (int i = 2; i < words.size(); ++i) {
    vector<int> d3(n - 1);
    for (int j = 1; j < n; ++j) {
      d3[j - 1] = words[i][j] - words[i][j - 1];
    }
    if (flag && !vector_equal(d1, d3)) return words[i];
    if (!flag && vector_equal(d1, d3)) return words[1];
    if (!flag && vector_equal(d2, d3)) return words[0];
  }
  return "";
}