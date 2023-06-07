//
// Created by TzashiNorpu on 2023/6/7.
//
#include "../header/header.h"

using namespace zero;

bool Solution::findRotation(vector <vector<int>> &mat, vector <vector<int>> &target) {
  int n = mat.size();
  vector<bool> b(4, true);
  for (int i = 0; i < n; ++i) {
    for (int j = 0; j < n; ++j) {
      // n=3
      // [0,1] -> [0,1]
      // [i,j] -> [i,j]
      // [0,1] -> [1,2]
      // [i,j] -> [j,n-i-1]
      // [0,1] -> [2，1]
      // [i,j] -> [n-i-1,n-j-1]
      // [0,1] -> [1，0]
      // [i,j] -> [n-j-1,i]
      if (mat[i][j] != target[i][j]) b[0] = false;
      if (mat[i][j] != target[n - j - 1][i]) b[1] = false;
      if (mat[i][j] != target[n - i - 1][n - j - 1]) b[2] = false;
      if (mat[i][j] != target[j][n - i - 1]) b[3] = false;
    }
  }
  return b[0] || b[1] || b[2] || b[3];
}