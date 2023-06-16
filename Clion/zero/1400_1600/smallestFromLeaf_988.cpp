//
// Created by TzashiNorpu on 2023/6/16.
//
#include "../header/header.h"

using namespace zero;

string Solution::smallestFromLeaf(TreeNode *root) {
  /*if (!root) return string(1, 'a' + 30);;
  if (root->left == nullptr && root->right == nullptr) return string(1, 'a' + root->val);
  'a' + root->val;
  string l = smallestFromLeaf(root->left) + char('a' + root->val);
  string r = smallestFromLeaf(root->right) + char('a' + root->val);
  return l < r ? l : r;*/
  // 小顶堆
  priority_queue <string, vector<string>, greater<string>> pq;
  function<void(TreeNode *, string)> helper = [&](TreeNode *node, string s) -> void {
      if (!node) {
        string x = (string(1, 'a' + 30) + s);
        x.reserve();
        pq.push(x);
        return;
      }
      if (node->left == nullptr && node->right == nullptr) {
        string x = string(1, 'a' + node->val) + s;
        x.reserve();
        pq.push(x);
        return;
      }
      helper(node->left, string(1, 'a' + node->val) + s);
      helper(node->right, string(1, 'a' + node->val) + s);
  };
  helper(root, "");
  return pq.top();
}