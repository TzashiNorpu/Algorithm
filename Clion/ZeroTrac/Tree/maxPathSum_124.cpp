//
// Created by TzashiNorpu on 10/18/2022.
//
#include "tree.h"

using namespace Tree;

int Solution::maxPathSum(TreeNode *root) {
  int res = -10000;
  function<int(TreeNode *node)> dfs = [&](TreeNode *node) -> int {
      if (!node) return -1;
      int l = dfs(node->left);
      int r = dfs(node->right);
      int v = max({node->val, node->val + l, node->val + r});
      res = max(res, v);
      return v;
  };
  dfs(root);
  return res;
}