//
// Created by admin on 2022/10/24.
//

#include "tree.h"

using namespace Tree;

vector<TreeNode *> Solution::delNodes(Tree::TreeNode *root, vector<int> &to_delete) {
    vector<TreeNode *> res;
    set<int>  del_nodes;
    for(auto del:to_delete) del_nodes.insert(del);
    function<TreeNode*(TreeNode*,bool )> dfs=[&](TreeNode* node,bool has_parent)->TreeNode*{
        if (!node) return nullptr;
        bool deleted= !(del_nodes.find(node->val) == del_nodes.end());
        // 没有父节点且不需要被删除，就是一个新的根节点
        if (!deleted&&!has_parent) res.push_back(node);
        // 当前节点需要删除 则子节点没有父元素
        // 当前节点不需要删除 则子节点有父元素
        node->left = dfs(node->left, !deleted);
        node->right = dfs(node->right, !deleted);
        return deleted ? nullptr : node;
    };
    dfs(root, false);
    return res;
}