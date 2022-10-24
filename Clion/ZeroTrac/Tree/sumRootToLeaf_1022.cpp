//
// Created by TzashiNorpu on 10/24/2022.
//
#include "tree.h"

using namespace Tree;

int Solution::sumRootToLeaf(TreeNode *root) {
  int res = 0, tmp = 0;
  function<void(TreeNode *)> dfs = [&](TreeNode *node) -> void {
      if (!node) {
        return;
      }
      if (node->left == nullptr && node->right == nullptr) {
        res += tmp << 1 | node->val;
        return;
      }
      tmp = tmp << 1 | node->val;
      dfs(node->left);
      dfs(node->right);
      tmp = tmp >> 1;
  };
  dfs(root);
  return res;
}
