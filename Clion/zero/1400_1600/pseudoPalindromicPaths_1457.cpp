//
// Created by tseringnorpu on 6/6/2023.
//
#include "../header/header.h"
using namespace zero;

int Solution::pseudoPalindromicPaths(TreeNode *root) {
    int count=0;
    unordered_map<int,int> r_map;
    auto valid=[&]()->bool{
        int odd_count=0;
        for(auto kv:r_map){
            if (kv.second%2!=0) odd_count++;
        }
        return odd_count<2;
    };
    function<void(TreeNode* )> helper=[&](TreeNode *node)->void{
        if (!node){
            return;
        }
        if (node->left == nullptr && node->right == nullptr) {
            r_map[node->val]++;
            if(valid()) count++;
            r_map[node->val]--;
            return;
        }
        r_map[node->val]++;
        helper(node->left);
        helper(node->right);
        r_map[node->val]--;
    };
    helper(root);
    return count;
}