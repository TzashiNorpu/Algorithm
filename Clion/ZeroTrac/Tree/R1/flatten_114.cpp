//
// Created by TzashiNorpu on 3/14/2023.
//
#include "tree_r1.h"

using namespace Tree;

void Solution::flatten(TreeNode *root) {
  if (!root) return;
  TreeNode *l = root->left;
  TreeNode *r = root->right;
  if (l) {
    root->left = nullptr;
    root->right = l;
    TreeNode *tmp = l;
    while (tmp && tmp->right) tmp = tmp->right;
    if (tmp)tmp->right = r;
  }
  flatten(l);
  flatten(r);
}