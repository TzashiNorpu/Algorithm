//
// Created by TzashiNorpu on 11/2/2022.
//
#include "tree.h"

using namespace Tree;

int Solution::findBottomLeftValue(TreeNode *root) {
  int max_level = 0;
  int res = 0;
  function<void(TreeNode *, int)> helper = [&](TreeNode *node, int level) -> void {
      if (!node) return;
      helper(node->left, level + 1);
      if (level > max_level) {
        max_level = level;
        res = node->val;
      }
      helper(node->right, level + 1);
  };
  helper(root, 1);
  return res;
}