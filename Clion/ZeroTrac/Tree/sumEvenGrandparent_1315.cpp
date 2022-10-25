//
// Created by TzashiNorpu on 10/25/2022.
//
#include "tree.h"

using namespace Tree;

int Solution::sumEvenGrandparent(TreeNode *root) {
  int sum = 0;
  function<void(TreeNode *, int, int)> dfs = [&](TreeNode *node, int p, int pp) {
      if (!node) return;
      if (pp % 2 == 0) sum += node->val;
      dfs(node->left, node->val, p);
      dfs(node->right, node->val, p);
  };
  dfs(root, -1, -1);
  return sum;
}