//
// Created by TzashiNorpu on 11/3/2022.
//
#include "tree.h"

using namespace Tree;

bool Solution::isSubtree(TreeNode *root, TreeNode *subRoot) {
  function<bool(TreeNode *, TreeNode *)> helper = [&](TreeNode *node1, TreeNode *node2) -> bool {
      if (!node1 && !node2) return true;
      if (!node1 || !node2) return false;
      if (node2->val == node1->val)
        return helper(node1->left, node2->left) && helper(node1->right, node2->right);
      return false;
  };
  if (!root) return false;
  if (helper(root, subRoot)) return true;
  return isSubtree(root->left, subRoot) || isSubtree(root->right, subRoot);
}