//
// Created by TzashiNorpu on 8/15/2022.
//
#include "header.h"

using namespace ZeroTrac;

bool dfs(ListNode *head, TreeNode *root) {
  if (!head) return true;
  if (!root) return false;
  return head->val == root->val && (dfs(head->next, root->left) || dfs(head->next, root->right));
}

bool Solution::isSubPath(ListNode *head, TreeNode *root) {
  if (!head) return true;
  if (!root) return false;
  return dfs(head, root) || isSubPath(head, root->left) || isSubPath(head, root->right);
}

