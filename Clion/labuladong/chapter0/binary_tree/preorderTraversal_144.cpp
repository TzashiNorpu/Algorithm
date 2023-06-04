//
// Created by tseringnorpu on 6/3/2023.
//
#include "../../header/header.h"

using namespace labuladong;

vector<int> Solution::preorderTraversal(TreeNode *root) {
    // root left right
    vector<int> res;
    if (!root) return res;
    res.push_back(root->val);
    auto t1 = preorderTraversal(root->left);
    res.insert(res.end(), t1.begin(), t1.end());
    auto t2 = preorderTraversal(root->right);
    res.insert(res.end(), t2.begin(), t2.end());
    return res;
}