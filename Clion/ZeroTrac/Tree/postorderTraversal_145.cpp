//
// Created by TzashiNorpu on 10/31/2022.
//
#include "tree.h"

using namespace Tree;

vector<int> Solution::postorderTraversal(TreeNode *root) {
  vector<int> res;
  function<void(TreeNode *)> helper = [&](TreeNode *node) -> void {
      if (!node) return;
      helper(node->left);
      helper(node->right);
      res.push_back(node->val);
  };
  helper(root);
  return res;
}