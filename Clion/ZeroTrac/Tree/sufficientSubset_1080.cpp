//
// Created by TzashiNorpu on 10/24/2022.
//
#include "tree.h"

using namespace Tree;

TreeNode *Solution::sufficientSubset(TreeNode *root, int limit) {
  if (!root)return nullptr;
  // 前序位置，接收父节点传递的 limit 约束决定叶子结点是否需要被删除
  if (!root->left && !root->right) return root->val < limit ? nullptr : root;
  // 先对左右子树进行删除，接收返回值
  root->left = sufficientSubset(root->left, limit - root->val);
  root->right = sufficientSubset(root->right, limit - root->val);
  // 后序位置，根据子树的删除情况决定自己是否需要被删除
  // 如果左右子树不满足 limit - root.val 的约束，那么就存在经过 root
  // 节点的路径不满足约束，也就说明 root 节点是「不足节点」，需要被删掉
  return root->left == root->right ? nullptr : root;
}