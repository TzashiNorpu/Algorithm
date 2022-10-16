//
// Created by TzashiNorpu on 9/30/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

vector<vector<int>> Solution::verticalTraversal(TreeNode *root) {
  vector<tuple<int, int, int>> nodes;
  function<void(TreeNode *, int, int)> dfs = [&](TreeNode *node, int row, int col) {
      if (!node) return;
      nodes.emplace_back(col, row, node->val);
      dfs(node->left, row + 1, col - 1);
      dfs(node->right, row + 1, col + 1);
  };
  dfs(root, 0, 0);
  sort(nodes.begin(), nodes.end());
  vector<vector<int>> res;
  int lastCol = INT_MIN;
  for (auto &[col, row, val]: nodes) {
    if (col != lastCol) lastCol = col, res.emplace_back();
    res.back().emplace_back(val);
  }
  return res;
}