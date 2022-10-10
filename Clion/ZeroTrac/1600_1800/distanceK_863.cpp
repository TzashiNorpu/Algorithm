//
// Created by TzashiNorpu on 10/10/2022.
//
#include "header.h"

using namespace ZeroTrac;

vector<int> Solution::distanceK(TreeNode *root, TreeNode *target, int k) {
  unordered_map<int, unordered_set<int>> dict;

  function<void(TreeNode *, TreeNode *)> preorder = [&](TreeNode *p, TreeNode *parent) -> void {
      if (p == nullptr) return;
      if (parent) {
        dict[p->val].insert(parent->val);
        dict[parent->val].insert(p->val);
      }
      if (p->left) preorder(p->left, p);
      if (p->right) preorder(p->right, p);
  };

  preorder(root, nullptr);
  vector<int> res, aux;
  res.push_back(target->val);
  unordered_set<int> visited;
  visited.insert(target->val);
  for (int d = 0; d < k; d++) {
    for (int u: res) {
      for (auto v: dict[u]) {
        if (visited.count(v)) continue;
        visited.insert(v);
        aux.push_back(v);
      }
    }
    // aux 里存着第n步的数据，res里存着第n-1步的数据
    res.clear();
    swap(res, aux);
  }
  return res;
}