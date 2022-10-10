#include <iostream>
#include "ZeroTrac/1600_1800/header.h"

int main() {
  ZeroTrac::Solution ins;
  vector<vector<int>> grid = {{1, 0, 7},
                              {2, 0, 6},
                              {3, 4, 5},
                              {0, 3, 0},
                              {9, 0, 20}};
  int res = ins.getMaximumGold(grid);
  printf("res=%d\n", res);
  return 0;
}
