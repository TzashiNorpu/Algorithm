//
// Created by TzashiNorpu on 10/31/2022.
//
#include "tree.h"

using namespace Tree;

vector<string> Solution::binaryTreePaths(TreeNode *root) {
  vector<string> res;
  function<void(TreeNode *, string)> helper = [&](TreeNode *node, string s) -> void {
      if (!node) return;
      if (!node->left && !node->right) {
        res.push_back(s + to_string(node->val));
        return;
      }
      helper(node->left, s + to_string(node->val) + "->");
      helper(node->right, s + to_string(node->val) + "->");
  };
  helper(root, "");
  return res;
}