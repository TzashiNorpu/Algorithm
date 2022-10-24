//
// Created by TzashiNorpu on 10/18/2022.
//

#ifndef CLION_TREE_H
#define CLION_TREE_H

#include "functional"
#include "deque"

using namespace std;
namespace Tree {
    struct TreeNode {
        int val;
        TreeNode *left;
        TreeNode *right;

        TreeNode() : val(0), left(nullptr), right(nullptr) {}

        TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}

        TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
    };

    class Solution {
    public:
        int maxDepth(TreeNode *root);

        int diameterOfBinaryTree(TreeNode *root);

        int maxPathSum(TreeNode *root);

        vector<int> largestValues(TreeNode *root);

        TreeNode *bstFromPreorder(vector<int> &preorder);

        int sumRootToLeaf(TreeNode *root);

        int maxAncestorDiff(TreeNode *root);

        TreeNode *sufficientSubset(TreeNode *root, int limit);
    };
}
#endif //CLION_TREE_H
