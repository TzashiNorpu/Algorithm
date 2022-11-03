#include <iostream>
#include "ZeroTrac/header/tree.h"

int main() {
  Tree::Solution ins = *new Tree::Solution;
  Tree::TreeNode *t = new Tree::TreeNode(2);
  t->left = new Tree::TreeNode(3);
  t->right = new Tree::TreeNode(1);
  t->left->left = new Tree::TreeNode(3);
  t->left->right = new Tree::TreeNode(1);
  t->right->right = new Tree::TreeNode(1);
  ins.pseudoPalindromicPaths(t);
  return 0;
}
