//
// Created by TzashiNorpu on 7/26/2022.
//
#include "header.h"

using namespace ZeroTrac;

pair<TreeNode *, int> helper(TreeNode *root) {
    if (!root) return {NULL, 0};
    auto left = helper(root->left);
    auto right = helper(root->right);
    if (left.second > right.second)
        return {left.first, left.second + 1};
    if (left.second < right.second)
        return {right.first, right.second + 1};
    // 相等时
    return {root, left.second + 1};

}

TreeNode *Solution::lcaDeepestLeaves_1123(TreeNode *root) {
    return helper(root).first;
}