//
// Created by TzashiNorpu on 3/16/2023.
//
#include "tree_r1.h"

using namespace Tree;

TreeNode *Solution::constructFromPrePost(vector<int> &preorder, vector<int> &postorder) {
  // post：当前节点的左/右子树在 postorder 中的起始位置【postorder中该位置+tree_node_count是左子树的范围】
  // prev：当前节点在preorder中的索引位置
  unordered_map<int, int> map;
  for (int i = 0; i < postorder.size(); i++) {
    map[postorder[i]] = i;
  }
  function<TreeNode *(int, int, int)> build = [&](int prev, int post, int tree_node_count) -> TreeNode * {
      if (tree_node_count <= 0) return nullptr;
      auto *node = new TreeNode(preorder[prev]);
      if (tree_node_count == 1) return node;
      int index = map[preorder[prev + 1]];
      int left_tree_node_count = index - post + 1;
      node->left = build(prev + 1, post, left_tree_node_count);
      node->right = build(prev + left_tree_node_count + 1, index + 1, tree_node_count - left_tree_node_count - 1);
      return node;
  };
  return build(0, 0, preorder.size());
}