//
// Created by TzashiNorpu on 10/12/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

bool Solution::checkMove(vector<vector<char>> &board, int rMove, int cMove, char color) {
  int dir[10] = {0, 1, 0, -1, 0, 1, 1, -1, -1, 1};
  for (int d = 0; d < 9; d++)
    for (int x = 1;; x++) {
      int i = rMove + x * dir[d], j = cMove + x * dir[d + 1];
      if (i < 0 || j < 0 || i >= 8 || j >= 8 || board[i][j] == '.') break;
      if (board[i][j] == color) {
        if (x > 1) return true;
        break;
      }
    }
  return false;
}