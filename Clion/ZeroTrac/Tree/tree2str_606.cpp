//
// Created by TzashiNorpu on 11/3/2022.
//
#include "tree.h"

using namespace Tree;

string Solution::tree2str(TreeNode *root) {
  string ans;
  function<void(TreeNode *)> helper = [&](TreeNode *node) -> void {
      if (!node) return;
      ans += to_string(node->val);
      if (node->left) { //left side check
        ans += '(';
        helper(node->left);
        ans += ')';
      }
      if (node->right) { //right side check
        if (!node->left) ans += "()"; //left side not present, but right side present
        ans += '(';
        helper(node->right);
        ans += ')';
      }
  };
  helper(root);
  return ans;
}