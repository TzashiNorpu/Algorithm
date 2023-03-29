#include <iostream>
#include "tree_r1.h"

int main() {
    auto *ser = new Tree::Codec();
    auto *deser = new Tree::Codec();
    auto *root = new TreeNode(1);
    root->left = new TreeNode(2);
    root->right = new TreeNode(3);
    root->right->left = new TreeNode(4);
    root->right->right = new TreeNode(5);
    string s = ser->serialize(root);
    TreeNode *node = deser->deserialize(s);
    return 0;
}
