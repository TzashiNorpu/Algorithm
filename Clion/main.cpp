#include <iostream>
#include "ZeroTrac/header/1800_1900.h"

int main() {
  ZeroTrac::Solution ins;
  vector<int> edges = {3, 3, 4, 2, 3};
  printf("res=%d\n", ins.longestCycle(edges));
  return 0;
}
