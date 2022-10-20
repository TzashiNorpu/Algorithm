//
// Created by TzashiNorpu on 10/18/2022.
//
#include "tree.h"

using namespace Tree;

int Solution::diameterOfBinaryTree(TreeNode *root) {
  // 每一条二叉树的「直径」长度，就是一个节点的左右子树的最大深度之和
  int res = 0;
  function<int(TreeNode *node)> dfs = [&](TreeNode *node) -> int {
      if (!node) return 0;
      int l = dfs(node->left);
      int r = dfs(node->right);
      res = max(res, l + r);
      return max(l, r) + 1;
  };
  dfs(root);
  return res;
}