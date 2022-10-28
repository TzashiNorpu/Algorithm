//
// Created by TzashiNorpu on 10/27/2022.
//
#include "tree.h"

using namespace Tree;

int Solution::longestZigZag(TreeNode *root) {
  int res = 0;
  function<void(TreeNode *, bool, bool, int)> helper = [&](TreeNode *node, bool
  left, bool right, int path) -> void {
      if (!node) return;
      res = max(res, path);
      helper(node->left, true, false, right ? path + 1 : 1);
      helper(node->right, false, true, left ? path + 1 : 1);
  };
  helper(root, false, false, 0);
  return res;
}