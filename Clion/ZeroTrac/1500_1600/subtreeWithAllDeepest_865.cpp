//
// Created by TzashiNorpu on 7/11/2022.
//
#include "header.h"

using namespace ZeroTrac;

// 「最深」的叶子节点的最近公共祖先
// 如果左右子树一样深，那么当前节点就是最近公共祖先；如果左右子树不一样深，那么最深叶子节点的最近公共祖先肯定在左右子树上。
TreeNode *subtreeWithAllDeepest_865::subtreeWithAllDeepest(TreeNode *root) {
    return helper(root);
}

TreeNode *subtreeWithAllDeepest_865::helper(TreeNode *pNode) {

    int left = helper(pNode->left);
}
