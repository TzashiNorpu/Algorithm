//
// Created by TzashiNorpu on 10/24/2022.
//
#include "tree.h"

using namespace Tree;

int Solution::maxAncestorDiff(TreeNode *root) {
  function<int(TreeNode *, int, int)> dfs = [&](TreeNode *node, int mn, int mx) -> int {
      if (!node)return mx - mn;
      mx = max(mx, node->val);
      mn = min(mn, node->val);
      return max(dfs(node->left, mn, mx), dfs(node->right, mn, mx));
  };
  return dfs(root, root->val, root->val);
}