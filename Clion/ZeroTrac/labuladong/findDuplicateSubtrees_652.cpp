//
// Created by TzashiNorpu on 3/29/2023.
//

#include "tree_r1.h"

using namespace Tree;

vector<TreeNode *> Solution::findDuplicateSubtrees(TreeNode *root) {

    /*
    vector<TreeNode *> res;
    unordered_set<TreeNode *> set;

    function<bool(TreeNode *, TreeNode *)> is_same = [&](TreeNode *node1, TreeNode *node2) -> bool {
        if (node1 == NULL && node2 == NULL) return true;
        if (!(node1 != NULL && node2 != NULL)) return false;
        if (node1->val != node2->val) return false;
        return is_same(node1->left, node2->left) && is_same(node1->right, node2->right);
    };
    function<bool(TreeNode *)> node_exits = [&](TreeNode *node) -> bool {
        for (auto x: res) {
            if (is_same(x, node)) return true;
        }
        return false;
    };
    function<bool(TreeNode *)> same_tree_exist = [&](TreeNode *node1) -> bool {
        for (auto node: set) {
            if (is_same(node, node1)) return true;
        }
        return false;
    };
    function<void(TreeNode *)> helper = [&](TreeNode *node) -> void {
        if (!node) return;
        if (same_tree_exist(node)) {
            if (!node_exits(node))res.push_back(node);
        } else {
            set.insert(node);
        }
        helper(node->left);
        helper(node->right);
    };
    helper(root);*/
    vector<TreeNode *> res;
    unordered_map<string, vector<TreeNode *>> map;
    function<string(TreeNode *)> serialize = [&](TreeNode *node) -> string {
        if (!node) return "";
        string s = "(" + serialize(node->left) + to_string(node->val) + serialize(node->right) + ")";
        map[s].push_back(node);
        if (map[s].size() == 2) res.push_back(node);
        return s;
    };
    serialize(root);
    /*for (auto x: map) {
        if (x.second.size() > 1) {
            res.push_back(x.second[0]);
        }
    }*/
    return res;
}