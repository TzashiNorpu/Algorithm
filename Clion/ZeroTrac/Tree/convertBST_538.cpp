//
// Created by TzashiNorpu on 11/3/2022.
//
#include "tree.h"

using namespace Tree;

TreeNode *Solution::convertBST(TreeNode *root) {
  int sum = 0;
  function<TreeNode *(TreeNode *)> helper = [&](TreeNode *node) -> TreeNode * {
      if (!node) return node;
      helper(node->right);
      node->val += sum;
      sum = node->val;
      helper(node->left);
      return node;
  };
  return helper(root);
}