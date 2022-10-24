#include <iostream>
#include "ZeroTrac/header/tree.h"

int main() {
  Tree::Solution ins = *new Tree::Solution;
  Tree::TreeNode *t = new Tree::TreeNode(1);
  t->left = new Tree::TreeNode(0);
  t->right = new Tree::TreeNode(1);
  t->left->left = new Tree::TreeNode(0);
  t->left->right = new Tree::TreeNode(1);
  t->right->left = new Tree::TreeNode(0);
  t->right->right = new Tree::TreeNode(1);
  ins.sumRootToLeaf(t);
  return 0;
}
