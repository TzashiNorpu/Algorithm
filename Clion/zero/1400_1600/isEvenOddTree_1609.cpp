//
// Created by TzashiNorpu on 2023/6/21.
//
#include "../header/header.h"

using namespace zero;

bool Solution::isEvenOddTree(TreeNode *root) {
  // 偶数层：奇数递增
  // 奇数层：偶数递减
  deque < TreeNode * > evenLevelQ;
  deque < TreeNode * > tmpQ;
  deque < TreeNode * > oddLevelQ;
  if (root->val % 2 == 0) return false;
  evenLevelQ.push_back(root);
  while (!evenLevelQ.empty()) {
    // 偶数层对奇数层入队
    for (auto &node: evenLevelQ) {
      if (node->left) {
        if (!oddLevelQ.empty())
          if (node->left->val >= oddLevelQ.back()->val) return false;
        if (node->left->val % 2 == 1) return false;
        oddLevelQ.push_back(node->left);
      }
      if (node->right) {
        if (!oddLevelQ.empty())
          if (node->right->val >= oddLevelQ.back()->val) return false;
        if (node->right->val % 2 == 1) return false;
        oddLevelQ.push_back(node->right);
      }
    }
    // 奇数层将下一偶数层入到临时队列中
    if (!oddLevelQ.empty()) {
      for (auto &node: oddLevelQ) {
        if (node->left) {
          if (!tmpQ.empty())
            if (node->left->val <= tmpQ.back()->val) return false;
          if (node->left->val % 2 == 0) return false;
          tmpQ.push_back(node->left);
        }
        if (node->right) {
          if (!tmpQ.empty())
            if (node->right->val <= tmpQ.back()->val) return false;
          if (node->right->val % 2 == 0) return false;
          tmpQ.push_back(node->right);
        }
      }
    }
    evenLevelQ = tmpQ;
    tmpQ.clear();
    oddLevelQ.clear();
  }
  return true;
}