//
// Created by TzashiNorpu on 11/2/2022.
//
#include "tree.h"

using namespace Tree;

int Solution::getMinimumDifference(TreeNode *root) {
  TreeNode *prev = nullptr;
  int res = INT_MAX;
  function<void(TreeNode *)> helper = [&](TreeNode *node) -> void {
      if (!node) return;
      helper(node->left);
      if (prev) res = min(res, abs(node->val - prev->val));
      prev = node;
      helper(node->right);
  };
  helper(root);
  return res;
}