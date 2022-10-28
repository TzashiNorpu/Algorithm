//
// Created by TzashiNorpu on 10/27/2022.
//
#include "tree.h"

using namespace Tree;
#define ll long long

int Solution::maxProduct(TreeNode *root) {
  int sum = 0;
  ll mod = 1e9 + 7;
  function<void(TreeNode *)> hepler_1 = [&](TreeNode *node) -> void {
      if (!node) return;
      sum += node->val;
      hepler_1(node->left);
      hepler_1(node->right);
  };
  hepler_1(root);

  ll res = INT_MIN;
  function<ll(TreeNode *)> helper_2 = [&](TreeNode *node) -> ll {
      if (!node)return 0;
      ll l = helper_2(node->left);
      ll r = helper_2(node->right);
      ll v = l + r + node->val;
      res = max(res, (sum - v) * v);
      return v;
  };
  helper_2(root);
  return res % mod;
}