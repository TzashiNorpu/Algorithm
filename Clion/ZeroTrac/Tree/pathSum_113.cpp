//
// Created by TzashiNorpu on 10/25/2022.
//
#include "tree.h"

using namespace Tree;

vector<vector<int>> Solution::pathSum(TreeNode *root, int targetSum) {
  vector<vector<int>> res;
  vector<int> tmp;
  int sum = 0;
  function<void(TreeNode *)> dfs = [&](TreeNode *node) -> void {
      if (!node) return;
      if (!node->left && !node->right)
        if (sum + node->val == targetSum) tmp.push_back(node->val), res.push_back(tmp), tmp.pop_back();
      sum += node->val;
      tmp.push_back(node->val);
      dfs(node->left);
      dfs(node->right);
      sum -= node->val;
      tmp.pop_back();
  };
  dfs(root);
  return res;
}