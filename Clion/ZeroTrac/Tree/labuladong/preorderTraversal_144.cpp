//
// Created by TzashiNorpu on 3/13/2023.
//
#include "tree_r1.h"
#include "string"

using namespace Tree;

vector<int> Solution::preorderTraversal(TreeNode *root) {
/*  vector<int> res;
  function<void(TreeNode *)> helper = [&](TreeNode *node) -> void {
      if (!node) return;
      res.push_back(node->val);
      helper(node->left);
      helper(node->right);
  };
  helper(root);
  return res;*/
  vector<int> res;
  if (!root) return res;
  res.push_back(root->val);
  const vector<int> &res1 = preorderTraversal(root->left);
  res.insert(res.end(), res1.begin(), res1.end());
  const vector<int> &res2 = preorderTraversal(root->right);
  res.insert(res.end(), res2.begin(), res2.end());
  return res;
}