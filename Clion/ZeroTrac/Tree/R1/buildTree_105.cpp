//
// Created by TzashiNorpu on 3/14/2023.
//
#include "tree_r1.h"

using namespace Tree;

TreeNode *Solution::buildTree_105(vector<int> &preorder, vector<int> &inorder) {
  int rootIdx = 0;
  unordered_map<int, int> map;
  for (int i = 0; i < inorder.size(); i++) {
    map[inorder[i]] = i;
    //value -> index mapping for inorder array
  }
  //***Note*** that rootIdx is passed as reference
  function<TreeNode *(int &, int, int)> build =
          [&](int &rootIdx, int left, int right) -> TreeNode * {
              // 当前区间无效
              if (left > right) return nullptr;
              /*int pivot = left;
              while (inorder[pivot] != preorder[rootIdx]) pivot++;*/
              int pivot = map[preorder[rootIdx]];
              TreeNode *node = new TreeNode(preorder[rootIdx]);
              // 为所有的节点都生成左右子树
              rootIdx++;
              //rootIdx value gets changed after successive calls to build the left subtree
              //Since it is passed as reference, updated value of rootIdx is passed to build the right subtree
              node->left = build(rootIdx, left, pivot - 1);
              node->right = build(rootIdx, pivot + 1, right);
              return node;
          };
  return build(rootIdx, 0, inorder.size() - 1);
}