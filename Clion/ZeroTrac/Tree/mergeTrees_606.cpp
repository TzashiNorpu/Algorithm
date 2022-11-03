//
// Created by TzashiNorpu on 11/3/2022.
//
#include "tree.h"

using namespace Tree;

TreeNode *Solution::mergeTrees(TreeNode *root1, TreeNode *root2) {
  if (!root1 && !root2) return nullptr;
  if (!root2 || !root1) {
    if (!root1) return root2;
    return root1;
  }
  auto *node = new TreeNode(root1->val + root2->val);
  node->left = mergeTrees(root1->left, root2->left);
  node->right = mergeTrees(root1->right, root2->right);
  return node;
}