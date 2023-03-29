//
// Created by TzashiNorpu on 3/13/2023.
//

#ifndef CLION_TREE_R1_H
#define CLION_TREE_R1_H

#include "vector"
#include "data.h"
#include "functional"
#include "string"
#include "unordered_set"

using namespace std;
namespace Tree {
    class Codec {
    public:
        // Encodes a tree to a single string.
        string serialize(TreeNode *root);

        // Decodes your encoded data to tree.
        TreeNode *deserialize(string data);
    };

    class Solution {
    public:
        int maxDepth(TreeNode *root);

        vector<int> preorderTraversal(TreeNode *root);

        int diameterOfBinaryTree(TreeNode *root);

        void flatten(TreeNode *root);

        Node *connect(Node *root);

        TreeNode *invertTree(TreeNode *root);

        TreeNode *buildTree_105(vector<int> &preorder, vector<int> &inorder);

        TreeNode *buildTree_106(vector<int> &preorder, vector<int> &inorder);

        TreeNode *constructFromPrePost(vector<int> &preorder, vector<int> &postorder);

        vector<TreeNode *> findDuplicateSubtrees(TreeNode *root);
    };

}
#endif //CLION_TREE_R1_H
