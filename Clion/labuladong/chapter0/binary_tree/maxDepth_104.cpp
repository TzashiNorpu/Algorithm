//
// Created by tseringnorpu on 6/3/2023.
//
#include "../../header/header.h"
using namespace labuladong;

int Solution::maxDepth(TreeNode *root) {
    if(!root) return 0;
    int l=maxDepth(root->left)+1;
    int r = maxDepth(root->right)+1;
    return max(l, r);
}