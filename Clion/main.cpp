#include <iostream>
#include "tree_r1.h"

int main() {
  Tree::Solution *test = new Tree::Solution();
  vector<int> pre = {1, 2, 4, 5, 3, 6, 7};
  vector<int> post = {4, 5, 2, 6, 7, 3, 1};
  TreeNode *res = test->constructFromPrePost(pre, post);
  return 0;
}
