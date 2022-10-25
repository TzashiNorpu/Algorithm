//
// Created by TzashiNorpu on 10/25/2022.
//
#include "tree.h"

using namespace Tree;

TreeNode *Solution::removeLeafNodes(TreeNode *root, int target) {
  function<TreeNode *(TreeNode *)> dfs = [&](TreeNode *node) -> TreeNode * {
      if (!node) return nullptr;
      node->left = dfs(node->left);
      node->right = dfs(node->right);
      if (!node->left && !node->right)
        if (node->val == target) return nullptr;
      return node;
  };
  return dfs(root);
}