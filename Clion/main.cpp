#include <iostream>
#include "tree_r1.h"

int main() {
  auto t = new Tree::Solution();
  vector<int> candidates = {10, 1, 2, 7, 6, 1, 5};
  t->combinationSum2(candidates, 8);
  return 0;
}
