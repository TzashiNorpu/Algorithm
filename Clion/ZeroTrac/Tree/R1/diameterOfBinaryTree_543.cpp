//
// Created by TzashiNorpu on 3/14/2023.
//

#include "tree_r1.h"

using namespace Tree;

int Solution::diameterOfBinaryTree(TreeNode *root) {
  int res = 0;
  function<int(TreeNode *)> helper = [&](TreeNode *node) -> int {
      if (!node) return 0;
      int l = helper(node->left);
      int r = helper(node->right);
      int cur_d = l + r;
      // 最大直径可能是从当前节点返回在上一层构成的 也可能是当前节点构成的
      res = max(cur_d, res);
      // 返回上一级时只能从 l|r 里选大的那一个
      return max(l, r) + 1;;
  };
  helper(root);
  return res;
}