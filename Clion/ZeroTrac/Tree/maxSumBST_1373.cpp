//
// Created by TzashiNorpu on 10/27/2022.
//
#include "tree.h"

using namespace Tree;

int Solution::maxSumBST(TreeNode *root) {
  int res = 0;
  /*
   * tmp[0] 记录以 root 为根的二叉树是否是 BST，若为 1 则说明是 BST，若为 0 则说明不是 BST；
   * tmp[1] 记录以 root 为根的二叉树所有节点中的最小值；
   * tmp[2] 记录以 root 为根的二叉树所有节点中的最大值；
   * tmp[3] 记录以 root 为根的二叉树所有节点值之和。
   */
  function<vector<int>(TreeNode *)> helper = [&](
          TreeNode *node) -> vector<int> {
      // 右 左
      if (!node) return {1, INT_MAX, INT_MIN, 0};
      vector<int> l = helper(node->left);
      vector<int> r = helper(node->right);
      vector<int> tmp(4, 0);
      // 当前节点可能是左节点或右节点
      if (l[2] < node->val && node->val < r[1] && l[0] && r[0]) {
        tmp[0] = 1;
        tmp[1] = min(l[1], node->val);
        tmp[2] = max(r[2], node->val);
        tmp[3] = l[3] + r[3] + node->val;
        res = max(res, tmp[3]);
      } else {
        tmp[0] = 0;
      }
      return tmp;
  };
  helper(root);
  return res;
}