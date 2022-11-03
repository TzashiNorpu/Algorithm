//
// Created by TzashiNorpu on 10/31/2022.
//
#include "tree.h"

using namespace Tree;

vector<int> Solution::findMode(TreeNode *root) {
  unordered_map<int, int> freq_map;
  int max_freq = 0;
  vector<int> res;
  function<void(TreeNode *)> helper = [&](TreeNode *node) -> void {
      if (!node) return;
      freq_map[node->val]++;
      max_freq = max(max_freq, freq_map[node->val]);
      helper(node->left);
      helper(node->right);
  };
  for (auto &kv: freq_map)
    if (kv.second == max_freq) res.push_back(kv.first);
  return res;
}