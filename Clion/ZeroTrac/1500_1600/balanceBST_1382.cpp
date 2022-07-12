//
// Created by TzashiNorpu on 7/12/2022.
//
#include "header.h"

using namespace ZeroTrac;

void balanceBST_1382::inorder(TreeNode *root) {
    if (root == NULL) return;
    inorder(root->left);
    nums.push_back(root->val);
    inorder(root->right);
}

TreeNode *balanceBST_1382::build(vector<int> inorder, int l, int r) {
    if (l > r) return nullptr;
    int mid = l + (r - l) / 2;
    TreeNode *root = new TreeNode(nums[mid]);
    root->left = build(nums, l, mid - 1);
    root->right = build(nums, mid + 1, r);
    return root;
}

TreeNode *balanceBST_1382::balanceBST(TreeNode *root) {
    inorder(root);
    return build(nums, 0, nums.size() - 1);
}




