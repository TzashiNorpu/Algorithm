//
// Created by admin on 2022/10/24.
//
#include "tree.h"

using namespace Tree;

bool Solution::isBalanced(Tree::TreeNode *root) {
    bool res= true;
    function<int(TreeNode*)> dfs=[&](TreeNode * node)->int{
        if (!node) return 0;
        int l = dfs(node->left);
        int r = dfs(node->right);
        if (abs(l-r)>1) res= false;
        return 1 + max(l, r);
    };
    dfs(root);
    return res;
}