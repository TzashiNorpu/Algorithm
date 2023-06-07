//
// Created by TzashiNorpu on 2023/6/7.
//
#include "../header/header.h"

using namespace zero;

TreeNode *Solution::removeLeafNodes(TreeNode *root, int target) {
  /*function < TreeNode * (TreeNode *) > helper = [&](TreeNode *node) -> TreeNode * {
      if (!node) return nullptr;
      node->left = helper(node->left);
      node->right = helper(node->right);
      if (!node->left && !node->right && node->val == target) return nullptr;
      else return node;
  };
  return helper(root);*/

  if (!root) return nullptr;
  root->left = removeLeafNodes(root->left, target);
  root->right = removeLeafNodes(root->right, target);
  if (!root->left && !root->right && root->val == target) return nullptr;
  else return root;
}