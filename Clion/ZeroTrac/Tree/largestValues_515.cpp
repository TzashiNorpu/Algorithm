//
// Created by TzashiNorpu on 10/24/2022.
//
#include "tree.h"

using namespace Tree;

vector<int> Solution::largestValues(TreeNode *root) {
  vector<int> res;
  deque<TreeNode *> q;
  if (root) q.push_back(root);
  while (!q.empty()) {
    int t = q.front()->val;
    int size = q.size();
    for (int i = 0; i < size; ++i) {
      TreeNode *front = q.front();
      t = max(t, front->val);
      q.pop_front();
      if (front->left) q.push_back(front->left);
      if (front->right)q.push_back(front->right);
    }
    res.push_back(t);
  }
  return res;
}