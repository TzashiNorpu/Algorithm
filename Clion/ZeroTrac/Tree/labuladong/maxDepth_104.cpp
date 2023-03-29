//
// Created by TzashiNorpu on 3/13/2023.
//
#include "tree_r1.h"

using namespace Tree;

int Solution::maxDepth(TreeNode *root) {
  if (!root) return 0;
  int l = maxDepth(root->left);
  int r = maxDepth(root->right);
  return max(l, r) + 1;
}