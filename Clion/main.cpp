#include <iostream>
#include "tree_r1.h"

int main() {
  Tree::Solution *test = new Tree::Solution();
  vector<int> pre = {3, 9, 8, 7, 11, 12, 20};
  vector<int> in = {11, 7, 12, 8, 9, 20, 3};
  test->buildTree_105(pre, in);
  return 0;
}
