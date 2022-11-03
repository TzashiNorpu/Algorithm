//
// Created by TzashiNorpu on 10/31/2022.
//
#include "tree.h"

using namespace Tree;

TreeNode *Solution::invertTree(TreeNode *root) {
  if (!root) return nullptr;
  TreeNode *l = invertTree(root->left);
  TreeNode *r = invertTree(root->right);
  root->left = r;
  root->right = l;
  return root;
}