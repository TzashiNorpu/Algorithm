//
// Created by TzashiNorpu on 10/27/2022.
//
#include "tree.h"

using namespace Tree;

bool Solution::isSubPath(ListNode *head, TreeNode *root) {
  function<bool(ListNode *, TreeNode *)> dfs = [&](ListNode *list, TreeNode *node) -> bool {
      if (!list)return true;
      if (!node) return false;
      return list->val == node->val && (dfs(list->next, node->left) || dfs(list->next, node->right));
  };
  if (!head) return true;
  if (!root) return false;
  return dfs(head, root) || isSubPath(head, root->left) || isSubPath(head, root->right);
}