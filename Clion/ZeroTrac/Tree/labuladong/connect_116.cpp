//
// Created by TzashiNorpu on 3/14/2023.
//
#include "tree_r1.h"

using namespace Tree;

Node *Solution::connect(Node *root) {
  function<void(Node *, Node *)> helper = [&](Node *l, Node *r) -> void {
      if (!l) return;
      l->next = r;
      helper(l->left, l->right);
      helper(l->right, r->left);
      helper(r->left, r->right);
  };
  if (!root) return root;
  helper(root->left, root->right);
  return root;
}