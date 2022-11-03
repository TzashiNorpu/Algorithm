//
// Created by TzashiNorpu on 11/3/2022.
//
#include "tree.h"

using namespace Tree;

int Solution::findTilt(TreeNode *root) {
  int res = 0;
  function<int(TreeNode *)> helper = [&](TreeNode *node) -> int {
      if (!node) return 0;
      if (!node->left && !node->right) return node->val;
      int l = helper(node->left);
      int r = helper(node->right);
      res += abs(r - l);
      return l + r + node->val;
  };
  helper(root);
  return res;
}