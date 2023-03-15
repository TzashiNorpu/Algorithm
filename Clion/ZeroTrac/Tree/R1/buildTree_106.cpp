//
// Created by TzashiNorpu on 3/15/2023.
//
#include "tree_r1.h"

using namespace Tree;

TreeNode *Solution::buildTree_106(vector<int> &inorder, vector<int> &postorder) {
  int n = inorder.size();
  unordered_map<int, int> map;
  for (int i = 0; i < n; ++i) {
    map[inorder[i]] = i;
  }

  function<TreeNode *(int &, int, int)> build
          = [&](int &rootIdx, int left, int right) -> TreeNode * {
              if (left > right) return nullptr;
              int pivot = map[postorder[rootIdx]];
              TreeNode *node = new TreeNode(postorder[rootIdx]);
              rootIdx--;
              node->right = build(rootIdx, pivot + 1, right);
              node->left = build(rootIdx, left, pivot - 1);
              return node;
          };
  int rootIdx = n - 1;
  return build(rootIdx, 0, n - 1);
}