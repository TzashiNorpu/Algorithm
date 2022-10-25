//
// Created by TzashiNorpu on 10/25/2022.
//
#include "tree.h"

using namespace Tree;

Node *Solution::connect(Node *root) {
  function<void(Node *, Node *)> dfs = [&](Node *l, Node *r) -> void {
      if (!l) return;
      l->next = r;
      dfs(l->left, l->right);
      dfs(l->right, r->left);
      dfs(r->left, r->right);
  };
  if (root)
    dfs(root->left, root->right);
  return root;
}