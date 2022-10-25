//
// Created by TzashiNorpu on 10/25/2022.
//
#include "tree.h"

using namespace Tree;

void Solution::flatten(TreeNode *root) {
  if (!root) return;
  flatten(root->left);
  flatten(root->right);
  TreeNode *l = root->left;
  TreeNode *r = root->right;
  root->left = nullptr;
  root->right = l;
  TreeNode *p = root;
  while (p->right) p = p->right;
  p->right = r;
}