//
// Created by TzashiNorpu on 3/29/2023.
//

#include "tree_r1.h"

using namespace Tree;

string Codec::serialize(TreeNode *root) {
    if (!root) return "x,";
    return to_string(root->val) + "," + serialize(root->left) + serialize(root->right);
}

//string data = "1,2,x,x,3,4,x,x,5,x,x,".
TreeNode *Codec::deserialize(string data) {
    queue<string> q;
    string s;
    for (int i = 0; i < data.size(); i++) {
        if (data[i] == ',') {
            q.push(s);
            s = "";
            continue;
        }
        s += data[i];
    }
    // 最后一个元素
//    if (s.size() != 0)q.push(s);
    function<TreeNode *()> helper = [&]() -> TreeNode * {
        if (q.size() == 0) return nullptr;
        auto c = q.front();
        q.pop();
        if (c == "x") return nullptr;
        TreeNode *node = new TreeNode(stoi(c));
        node->left = helper();
        node->right = helper();
        return node;
    };
    return helper();
}