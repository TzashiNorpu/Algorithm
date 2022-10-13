//
// Created by TzashiNorpu on 7/11/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

pair<int, TreeNode *> helper(TreeNode *root) {
  if (!root) return {0, NULL};
  pair<int, TreeNode *> l = helper(root->left), r = helper(root->right);

  int d1 = l.first, d2 = r.first;
  return {max(d1, d2) + 1, d1 == d2 ? root : d1 > d2 ? l.second : r.second};
}

// 「最深」的叶子节点的最近公共祖先
// 如果左右子树一样深，那么当前节点就是最近公共祖先；如果左右子树不一样深，那么最深叶子节点的最近公共祖先肯定在左右子树上。
TreeNode *subtreeWithAllDeepest_865::subtreeWithAllDeepest(TreeNode *root) {
  return helper(root).second;
}


