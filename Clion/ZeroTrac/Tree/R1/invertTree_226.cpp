//
// Created by TzashiNorpu on 3/14/2023.
//
#include "tree_r1.h"

using namespace Tree;

TreeNode *Solution::invertTree(TreeNode *root) {
  if (!root) return nullptr;
  TreeNode *l = root->left;
  TreeNode *r = root->right;
  root->left = invertTree(r);
  root->right = invertTree(l);
  return root;
}