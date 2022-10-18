//
// Created by TzashiNorpu on 10/18/2022.
//
#include "tree.h"

using namespace Tree;

int Solution::maxDepth(TreeNode *root) {
  // 遍历：每个节点的深度
  /*
  if (!root) return 0;
  int res = 1;
  function<void(TreeNode *node, int d)> dfs_1 = [&](TreeNode *node, int d) -> void {
      if (!node) return;
      if (node->left == nullptr && node->right == nullptr) res = max(res, d);
      d++;
      dfs_1(node->left, d);
      dfs_1(node->right, d);
      d--;
  };
  dfs_1(root, 1);*/
  // 拆分：一棵二叉树的最大深度可以通过子树的最大深度推导出来
  function<int(TreeNode *node)> dfs_2 = [&](TreeNode *node) -> int {
      if (!node) return 0;
      int l = dfs_2(node->left);
      int r = dfs_2(node->right);
      return max(l, r) + 1;
  };
  return dfs_2(root);
}