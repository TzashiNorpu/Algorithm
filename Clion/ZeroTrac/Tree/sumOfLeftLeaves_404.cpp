//
// Created by TzashiNorpu on 10/31/2022.
//
#include "tree.h"

using namespace Tree;

int Solution::sumOfLeftLeaves(TreeNode *root) {
  int sum = 0;
  function<void(TreeNode *)> helper = [&](TreeNode *node) -> void {
      if (!node) return;
      if (node->left && !node->left->right && !node->left->left) sum += node->left->val;
      helper(node->left);
      helper(node->right);
  };
  helper(root);
  return sum;
}