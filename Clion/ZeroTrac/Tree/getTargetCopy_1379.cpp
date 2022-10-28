//
// Created by TzashiNorpu on 10/28/2022.
//
#include "tree.h"

using namespace Tree;

TreeNode *Solution::getTargetCopy(TreeNode *original, TreeNode *cloned, TreeNode *target) {
  TreeNode *res = nullptr;
  function<void(TreeNode *, TreeNode *)> helper = [&](TreeNode *o, TreeNode *c) {
      if (!o || !c)return;
      if (o == target) {
        res = c;
        return;
      }
      helper(o->left, c->left);
      helper(o->right, c->right);
  };
  helper(original, cloned);
  return res;
}