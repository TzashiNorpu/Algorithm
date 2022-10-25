//
// Created by TzashiNorpu on 10/18/2022.
//

#ifndef CLION_TREE_H
#define CLION_TREE_H

#include "functional"
#include "deque"
#include <set>

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

    class Node {
    public:
        int val;
        Node *left;
        Node *right;
        Node *next;

        Node() : val(0), left(NULL), right(NULL), next(NULL) {}

        Node(int _val) : val(_val), left(NULL), right(NULL), next(NULL) {}

        Node(int _val, Node *_left, Node *_right, Node *_next)
                : val(_val), left(_left), right(_right), next(_next) {}
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

        bool isBalanced(TreeNode *root);

        vector<TreeNode *> delNodes(TreeNode *root, vector<int> &to_delete);

        vector<vector<int>> pathSum(TreeNode *root, int targetSum);

        void flatten(TreeNode *root);

        Node *connect(Node *root);

        int sumNumbers(TreeNode *root);

        int sumEvenGrandparent(TreeNode *root);

        TreeNode *removeLeafNodes(TreeNode *root, int target);
    };
}
#endif //CLION_TREE_H
