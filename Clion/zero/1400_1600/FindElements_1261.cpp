//
// Created by TzashiNorpu on 2023/6/21.
//
#include "../header/header.h"

using namespace zero;

FindElements::FindElements(TreeNode *root) {
  this->root = root;
  function<void(TreeNode *, int)> helper = [&](TreeNode *node, int value) -> void {
      if (!node) return;
      node->val = value;
      this->values.insert(value);
      helper(node->left, 2 * value + 1);
      helper(node->right, 2 * value + 2);
  };
  helper(root, 0);
}

bool FindElements::find(int target) {
  return this->values.find(target) != this->values.end();
}