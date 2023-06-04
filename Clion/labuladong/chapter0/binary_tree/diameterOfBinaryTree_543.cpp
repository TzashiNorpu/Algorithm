//
// Created by tseringnorpu on 6/3/2023.
//
#include "../../header/header.h"
using namespace labuladong;

int Solution::diameterOfBinaryTree(TreeNode *root) {
    // 返回上一级时只能从 l|r 里选大的那一个
    // 最大直径可能是从当前节点返回在上一层构成的 也可能是当前节点构成的
    int res=0;
    function<int(TreeNode*)> helper=[&](TreeNode *node)->int {
        if (!node) return 0;
        int l = helper(node->left);
        int r = helper(node->right);
        res = max(res,l + r);
        return max(l,r)+1;
    };
    helper(root);
    return res;
}