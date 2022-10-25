//
// Created by TzashiNorpu on 10/25/2022.
//
#include "tree.h"

using namespace Tree;

int Solution::sumNumbers(TreeNode *root) {
  int sum = 0, res = 0;
  function<void(TreeNode *)> dfs = [&](TreeNode *node) -> void {
      if (!node) return;
      if (!node->left && !node->right) {
        res += (sum * 10 + node->val);
        return;
      }
      sum = sum * 10 + node->val;
      dfs(node->left);
      dfs(node->right);
      sum /= 10;
  };
  return res;
}