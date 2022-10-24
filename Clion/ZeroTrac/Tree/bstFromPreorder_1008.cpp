//
// Created by TzashiNorpu on 10/24/2022.
//
#include "tree.h"

using namespace Tree;

TreeNode *Solution::bstFromPreorder(vector<int> &preorder) {
  int index = 0;
  function<TreeNode *(int)> dfs = [&](int bound) -> TreeNode * {
      if (index == preorder.size() || preorder[index] > bound) return nullptr;
      TreeNode *node = new TreeNode(preorder[index++]);
      // 左子树的上限是当前节点值
      node->left = dfs(node->val);
      // 右子树的上限是当前节点父节点值
      node->right = dfs(bound);
      return node;
  };
  return dfs(INT_MAX);
}