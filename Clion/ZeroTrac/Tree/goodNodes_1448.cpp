//
// Created by TzashiNorpu on 10/28/2022.
//
#include "tree.h"

using namespace Tree;

int Solution::goodNodes(TreeNode *root) {
  int res = 0;
  function<void(TreeNode *, int)> helper = [&](TreeNode *node, int path_max) -> void {
      if (!node) return;
      if (path_max <= node->val) res++;
      path_max = max(path_max, node->val);
      helper(node->left, path_max);
      helper(node->right, path_max);
  };
  helper(root, root->val);
  return res;
}