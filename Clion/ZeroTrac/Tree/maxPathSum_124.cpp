//
// Created by TzashiNorpu on 10/18/2022.
//
#include "tree.h"

using namespace Tree;

int Solution::maxPathSum(TreeNode *root) {
  int res = -10000;
  function<int(TreeNode *node)> dfs = [&](TreeNode *node) -> int {
      if (!node) return 0;
      int l = max(0,dfs(node->left));
      int r = max(0,dfs(node->right));
      res = max(res, l+r+node->val);
      return node->val+max(l,r);
  };
  dfs(root);
  return res;
}