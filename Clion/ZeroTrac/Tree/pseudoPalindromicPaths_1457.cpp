//
// Created by TzashiNorpu on 10/31/2022.
//
#include "tree.h"

using namespace Tree;

int Solution::pseudoPalindromicPaths(TreeNode *root) {
  unordered_map<int, int> count;
  int res = 0;
  auto odd_count = [&](unordered_map<int, int> &m) -> bool {
      int count = 0;
      for (auto &kv: m)
        if (kv.second & 1) count++;
      return count <= 1;
  };

  function<void(TreeNode *)> helper = [&](TreeNode *node) -> void {
      if (!node)
        return;
      if (!node->left && !node->right) {
        count[node->val]++;
        if (odd_count(count)) res++;
        count[node->val]--;
      }
      count[node->val]++;
      helper(node->left);
      helper(node->right);
      count[node->val]--;
  };
  helper(root);
  return res;
}