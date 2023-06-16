//
// Created by TzashiNorpu on 2023/6/16.
//
#include "../header/header.h"

using namespace zero;

int Solution::sumEvenGrandparent(TreeNode *root) {
  int sum = 0;
  function<void(TreeNode *, int, int)> dfs = [&](TreeNode *node, int p, int pp) {
      if (!node) return;
      if (pp % 2 == 0) sum += node->val;
      dfs(node->left, node->val, p);
      dfs(node->right, node->val, p);
  };
  dfs(root, 1, 1);
  return sum;
}